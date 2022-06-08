package bubbleSort;

import java.util.List;

public class BubbleSort {

    public List<Object> sort(List<Object> input) throws RuntimeException {

        if (input == null) {
            throw new RuntimeException();
        }

        input.removeIf(x -> x == null || x.toString().matches("[a-zA-Z]+"));

        boolean flag = true;
        int i = 0;

        while (i < input.size() && flag) {
            flag = false;
            for (int j = 0; j < input.size() - 1; j++) {
                Double x = new Double(input.get(j).toString());
                Double y = new Double(input.get(j + 1).toString());
                if (x.compareTo(y) > 0) {
                    Object temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }

        return input;
    }
}
