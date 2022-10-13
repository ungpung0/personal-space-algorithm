package level0;

public class PasswordDecode {

    // Solution Method.
    public String solution(String cipher, int code) {
        final int ARRAY_LENGTH = cipher.length();
        String answer = "";

        for(int i = 1; i <= ARRAY_LENGTH; i++) {
            int condition = code * i - 1;
            if(condition < ARRAY_LENGTH)
                answer += cipher.charAt(condition);
            else
                break;
        }

        return answer;
    }

    // Test Method.
    public static void main(String[] args) {
        PasswordDecode test = new PasswordDecode();
        System.out.println(test.solution("attack", 1));
    }
}
