package balancedWordsCounter;

public class BalancedWordsCounter {

    private int counter;

    public int count(String input) throws RuntimeException {
        if (input == null) {
            throw new RuntimeException();
        }
        if (!input.matches("[a-zA-Z]+") && (input != "")) {
            throw new RuntimeException();
        }
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length() + 1; j++) {
                String subString = input.substring(i, j);
                this.checkSubString(subString);
            }
        }
        return this.counter;
    }

    private void checkSubString(String subString) {
        long charCounter = 0;
        while(subString.length() > 0) {
            char testedChar = subString.charAt(0);
            if (charCounter == 0) {
                charCounter = subString.chars().filter(ch -> ch == testedChar).count();
            } else {
                if (charCounter != subString.chars().filter(ch -> ch == testedChar).count()) {
                    return;
                }
            }
            subString = subString.replace(String.valueOf(testedChar), "");
        }
        this.counter++;
    }
}
