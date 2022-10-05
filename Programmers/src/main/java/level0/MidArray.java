package level0;

import java.util.Arrays;

public class MidArray {

    // Solution Method.
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
