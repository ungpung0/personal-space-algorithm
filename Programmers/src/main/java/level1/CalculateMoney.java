package level1;

public class CalculateMoney {

    // Solution Method.
    private long solution(int price, int money, int count) {
        long value = 0;
        long answer = money;
        while(count != 0) {
            value = count * price;
            answer -= value;
            count--;
        }
        answer *= (answer <= 0) ? -1 : 0;
        return answer;
    }

    // Test Method.
    public static void main(String[] args) {
        CalculateMoney test = new CalculateMoney();
        System.out.println(test.solution(1000000, 100, 2500));
    }
}
