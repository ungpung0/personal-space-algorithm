package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    // Solution Method.
    public String solution(String my_string) {
        String[] reverse = my_string.split("");
        String result = "";
        for(int i = reverse.length - 1; i >= 0; i--)
            result += reverse[i];
        return result;
    }

}
