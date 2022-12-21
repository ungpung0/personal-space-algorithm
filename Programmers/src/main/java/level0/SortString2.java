package level0;

import java.util.Arrays;

public class SortString2 {
    // Solution Method.
    private String solution(String my_string) {
        char[] answer = my_string.toLowerCase().toCharArray();

        Arrays.sort(answer);

        return String.valueOf(answer);
    }
}
