package balancedWordsCounter;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalancedWordsCounterTest {

    @Test(expected = RuntimeException.class)
    public void givenBalancedWordsCounterWhenStringContainsOtherCharacterEndThenRuntimeException() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "abababa1";
        // Then
        balancedWordsCounter.count(input);
    }



    @Test(expected = RuntimeException.class)
    public void givenBalancedWordsCounterWhenInputIsNullThenRuntimeException() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = null;
        balancedWordsCounter.count(input);
        // Then

    }

    @Test
    public void givenBalancedWordsCounterWhenFirstStringThenResult() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "aabbabcccba";
        int result = 28;
        // Then
        assertEquals(result, balancedWordsCounter.count(input));
    }

    @Test
    public void givenBalancedWordsCounterWhenEmptyStringThenResult() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "";
        int result = 0;
        // Then
        assertEquals(result, balancedWordsCounter.count(input));
    }

    @Test
    public void givenBalancedWordsCounterWhenSecondStringThenResult() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "aabbcbcccbaa";
        int result = 30;
        // Then
        assertEquals(result, balancedWordsCounter.count(input));
    }

    @Test
    public void givenBalancedWordsCounterWhenThirdStringThenResult() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "mama";
        int result = 8;
        // Then
        assertEquals(result, balancedWordsCounter.count(input));
    }

    @Test
    public void givenBalancedWordsCounterWhenFourthStringThenResult() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "abcba";
        int result = 11;
        // Then
        assertEquals(result, balancedWordsCounter.count(input));
    }

    @Test
    public void givenBalancedWordsCounterWhenFifthStringThenResult() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "aaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffff";
        int result = 669;
        // Then
        assertEquals(result, balancedWordsCounter.count(input));
    }

    @Test
    public void givenBalancedWordsCounterWhenCharThenResult() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "a";
        int result = 1;
        // Then
        assertEquals(result, balancedWordsCounter.count(input));
    }

    @Ignore
    @Test
    public void givenBalancedWordsCounterWhenLongStringThenResult() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "aaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvffffffffvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvffffffffvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffff";
        int result = 32322;
        // Then
        assertEquals(result, balancedWordsCounter.count(input));
    }

    @Test(expected = RuntimeException.class)
    public void givenBalancedWordsCounterWhenStringContainsOtherCharacterMiddleThenRuntimeException() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "aaaaaaaaaaaaaabbbbbbbbbccaaaaaaa5aaaaaaabbbbbbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffff";
        balancedWordsCounter.count(input);
        // Then
    }

    @Test(expected = RuntimeException.class)
    public void givenBalancedWordsCounterWhenStringContainsOtherCharacterBeginningThenRuntimeException() {
        // Given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        // When
        String input = "7aaaaaaaaaaaaaabbbbbbbbbccaaaaaaaaaaaaaabbbb+bbbbbcccccddvvvvvfffffcccddvvvvvfffffaaaaaaaaaaaaaabbbbbbbbbcccccddvvvvvfffff";
        balancedWordsCounter.count(input);
        // Then
    }
}