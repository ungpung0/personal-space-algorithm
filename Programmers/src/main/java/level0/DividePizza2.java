package level0;

public class DividePizza2 {
    // Solution Method.
    private int solution(int n) {
        int answer = 1;

        while(true) {
            if(answer * 6 % n == 0) {
                break;
            }else {
                answer++;
            }
        }

        return answer;
    }

}
