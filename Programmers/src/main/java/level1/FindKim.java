package level1;

import java.util.Arrays;

public class FindKim {

    // Solution Method.
    public String solution(String[] seoul) {
        return "김서방은 " + String.valueOf(Arrays.asList(seoul).indexOf("Kim")) + "에 있다";
    }
}
