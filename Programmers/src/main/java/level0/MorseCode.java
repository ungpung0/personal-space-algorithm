package level0;

public class MorseCode {
    // Solution Method.
    private String solution(String letter) {
        final String[] TEMPLATE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", ".."
                , ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-"
                , "...-", ".--", "-..-", "-.--", "--.."};
        final int ASCII_VALUE = 97;

        String[] answer = letter.split(" ");
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < TEMPLATE.length; j++) {
                if(answer[i].equals(TEMPLATE[j])) {
                    answer[i] = String.valueOf((char)(j + ASCII_VALUE));
                }
            }
        }

        return String.join("", answer);
    }
}
