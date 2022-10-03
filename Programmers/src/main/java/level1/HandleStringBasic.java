package level1;

public class HandleStringBasic {

    // Solution Method.
    public boolean solution(String s) {
        final int LENGTH = s.length();
        if(LENGTH == 4 || LENGTH == 6) {
            boolean answer = true;
            for(int i = 0; i < LENGTH; i++) {
                answer = s.charAt(i) >= 48 && s.charAt(i) <= 57;
                if(!answer)
                    break;
            }
            return answer;
        }else {
            return false;
        }
    }

    // Test Method.
    public static void main(String[] args) {
        HandleStringBasic test = new HandleStringBasic();
        System.out.println(test.solution("1234ab"));
    }

}
