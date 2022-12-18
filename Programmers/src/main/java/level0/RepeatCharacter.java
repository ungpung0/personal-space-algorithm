package level0;

public class RepeatCharacter {
    // Solution Method.
    private String solution(String my_string, int n) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++) {
            for(int j = 0; j < n; j++)
                answer += my_string.charAt(i);
        }

        return answer;
    }

    // Test Main Method.
    public static void main(String[] args) {
        RepeatCharacter test = new RepeatCharacter();
        System.out.println(test.solution("hello", 3));
    }
}
