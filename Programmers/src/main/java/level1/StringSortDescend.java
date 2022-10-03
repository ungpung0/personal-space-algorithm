package level1;

import java.util.Arrays;
import java.util.Collections;

public class StringSortDescend {

    // Solution Method.
    public String solution(String s) {
        String[] array = s.split("");
        Arrays.sort(array, Collections.reverseOrder());
        return String.join("", array);
    }

    // Test Method.
    public static void main(String[] args) {
        StringSortDescend test = new StringSortDescend();
        System.out.println(test.solution("Zbcdefg"));
    }
}
