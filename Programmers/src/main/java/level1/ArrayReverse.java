package level1;

import java.util.Arrays;

public class ArrayReverse {

    // Solution Method.
    public int[] solution(long n) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(n));
        int[] numbers = Arrays.stream(stringBuilder.reverse().toString().split("")).mapToInt(Integer::parseInt).toArray();
        return numbers;
    }

}
