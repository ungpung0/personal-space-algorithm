package level1;

import java.util.Arrays;

public class SumNone {

    // Solution Method.
    public int solution(int[] numbers) {
        int result = 45;
        for(int data : numbers)
            result -= data;
        return result;
    }
}
