package level1;
public class SumDigits {

    // Solution Method.
    public int solution(int n) {
        int answer = 0;

        String[] numbers = String.valueOf(n).split("");
        for(int i = 0; i < numbers.length; i++) {
            answer += Integer.parseInt(numbers[i]);
        }

        return answer;
    }

    // Test Method.
    public static void main(String[] args) {
        SumDigits test = new SumDigits();
        System.out.println(test.solution(123));
        System.out.println(test.solution(987));
    }
}
