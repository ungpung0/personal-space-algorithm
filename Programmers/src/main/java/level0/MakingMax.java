package level0;

import java.util.Arrays;

public class MakingMax {

    // Solution Method.
    public int solution(int[] numbers) {
        final int LENGTH = numbers.length;
        Arrays.sort(numbers);
        return numbers[LENGTH - 1] * numbers[LENGTH - 2];
    }
}
