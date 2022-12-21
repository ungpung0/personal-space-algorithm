package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SwapIndex {
    // Solution Method.
    private String solution(String my_string, int num1, int num2) {
        char[] array = my_string.toCharArray();

        char temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;

        return String.valueOf(array);
    }

    // Another Method.
    private String anotherSolution(String my_string, int num1, int num2) {
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);

        return String.join("", list);
    }
}
