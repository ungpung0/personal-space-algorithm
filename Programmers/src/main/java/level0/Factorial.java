package level0;

public class Factorial {
    // Solution Method.
    private int solution(int n) {
        int temp = 1, answer = 1;

        while(n >= temp) {
            answer++;
            temp *= answer;
        }

        return answer - 1;
    }
}
