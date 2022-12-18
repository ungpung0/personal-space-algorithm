package level0;

import java.io.*;

public class DeleteSpecificCharacter {
    // Solution Method.
    private String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    // Main Method.
    public static void main(String[] args) {
        DeleteSpecificCharacter test = new DeleteSpecificCharacter();
        test.solution("abcdef", "f");
    }
}
