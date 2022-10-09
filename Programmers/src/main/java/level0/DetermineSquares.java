package level0;

public class DetermineSquares {

    // Solution Method.
    private int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 1000; i++) {
            int nCompare = (int)Math.pow(i, 2);
            if(n <= nCompare) {
                answer = (n == nCompare) ? 1 : 2;
                break;
            }
        }
        return answer;
    }

    // Test Method.
    public static void main(String[] args) {
        DetermineSquares test = new DetermineSquares();
        System.out.println(test.solution(144));
    }
}
