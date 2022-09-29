package level1;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    // Solution Method.
    public long solution(long n) {
        String[] array = String.valueOf(n).split("");
        Arrays.sort(array, Collections.reverseOrder());

        String result = "";
        for(String data : array) {
            result += data;
        }

        return Long.parseLong(result);
    }

    // Test Method.
    public static void main(String[] args) {
        DescendingOrder test = new DescendingOrder();
        System.out.println(test.solution(118372));
    }

}
