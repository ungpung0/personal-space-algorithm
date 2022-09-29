package level1;

public class QuotientOne {

    // Solution Method.
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i < n; i++) {
            answer = i;
            if(n % i == 1)
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        QuotientOne test = new QuotientOne();
        System.out.println(test.solution(12));
    }
}
