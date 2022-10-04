package level0;

import java.util.Arrays;

public class ArrayAverage {

    // Solution Method.
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}
