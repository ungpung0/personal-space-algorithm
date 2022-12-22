package level0;

import java.util.Arrays;

public class CharacterOnlyOne {
    // Solution Method.
    private String solution(String s) {
        String[] array= s.split("");
        Arrays.sort(array);

        String temp = array[0];
        for(int i = 1; i < s.length(); i++) {
            if(temp.equals(array[i])) {
                array[i] = "";
                array[i - 1] = "";
            }else {
                temp = array[i];
            }
        }

        return String.join("", array);
    }

    // Test Main Method.
    public static void main(String[] args) {
        CharacterOnlyOne test = new CharacterOnlyOne();

        String case1 = "hello";
        System.out.println(test.solution(case1));
    }
}
