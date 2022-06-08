package bubbleSort;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

    @Test
    public void givenBubbleSortWhenListWithIntsThenFirstResult() {
        // Given
        BubbleSort bubbleSort = new BubbleSort();
        // When
        List<Object> input = new ArrayList<>(
                Arrays.asList(1, 4, 5, 6, 8, 3, 8)
        );

        List<Object> result = new ArrayList<>(
                Arrays.asList(1, 3, 4, 5, 6, 8, 8)
        );
        // Then
        Assert.assertEquals(result, bubbleSort.sort(input));
    }

    @Test
    public void givenBubbleSortWhenListWithIntsAndDoublesThenSecondResult() {
        // Given
        BubbleSort bubbleSort = new BubbleSort();
        // When
        List<Object> input = new ArrayList<>(
                Arrays.asList(-9.3, 0.2, 4, 0.1, 5, 9)
        );

        List<Object> result = new ArrayList<>(
                Arrays.asList(-9.3, 0.1, 0.2, 4, 5, 9)
        );
        // Then
        Assert.assertEquals(result, bubbleSort.sort(input));
    }

    @Test
    public void givenBubbleSortWhenListEmptyThenResult() {
        // Given
        BubbleSort bubbleSort = new BubbleSort();
        // When
        List<Object> input = new ArrayList<>();

        List<Object> result = new ArrayList<>();
        // Then
        Assert.assertEquals(result, bubbleSort.sort(input));
    }

    @Test
    public void givenBubbleSortWhenListWithNullAtStartAndDoublesThenResult() {
        // Given
        BubbleSort bubbleSort = new BubbleSort();
        // When
        List<Object> input = new ArrayList<>(
                Arrays.asList(null, 5.0001)
        );

        List<Object> result = new ArrayList<>(
                Arrays.asList(5.0001)
        );
        // Then
        Assert.assertEquals(result, bubbleSort.sort(input));
    }

    @Test(expected = RuntimeException.class)
    public void givenBubbleSortWhenListIsNullThenThrowRuntimeException() {
        // Given
        BubbleSort bubbleSort = new BubbleSort();
        // When
        bubbleSort.sort(null);
        // Then

    }

    @Test
    public void givenBubbleSortWhenListWithNullAtTheEndAndDoublesThenResult() {
        // Given
        BubbleSort bubbleSort = new BubbleSort();
        // When
        List<Object> input = new ArrayList<>(
                Arrays.asList(5.0001, null)
        );

        List<Object> result = new ArrayList<>(
                Arrays.asList(5.0001)
        );
        // Then
        Assert.assertEquals(result, bubbleSort.sort(input));
    }

    @Test
    public void givenBubbleSortWhenListWithNullInTheMiddleThenResult() {
        // Given
        BubbleSort bubbleSort = new BubbleSort();
        // When
        List<Object> input = new ArrayList<>(
                Arrays.asList(5.0001, null, -5)
        );

        List<Object> result = new ArrayList<>(
                Arrays.asList(-5, 5.0001)
        );
        // Then
        Assert.assertEquals(result, bubbleSort.sort(input));
    }

    @Test
    public void givenBubbleSortWhenListWithManyNullsThenResult() {
        // Given
        BubbleSort bubbleSort = new BubbleSort();
        // When
        List<Object> input = new ArrayList<>(
                Arrays.asList(null, 5.0001, null, -6.12345,  null, -5, 6.0536, 6.6, 5, null)
        );

        List<Object> result = new ArrayList<>(
                Arrays.asList(-6.12345, -5, 5, 5.0001, 6.0536, 6.6)
        );
        // Then
        Assert.assertEquals(result, bubbleSort.sort(input));
    }

    @Test
    public void givenBubbleSortWhenListWithManyNullsAndStringThenResult() {
        // Given
        BubbleSort bubbleSort = new BubbleSort();
        // When
        List<Object> input = new ArrayList<>(
                Arrays.asList(null, 5.0001, null, -6.12345,  null, -5, 6.0536, 6.6, 5, null, "test")
        );

        List<Object> result = new ArrayList<>(
                Arrays.asList(-6.12345, -5, 5, 5.0001, 6.0536, 6.6)
        );
        // Then
        Assert.assertEquals(result, bubbleSort.sort(input));
    }
}