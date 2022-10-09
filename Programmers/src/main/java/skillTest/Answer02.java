package skillTest;

public class Answer02 {

    private long solution(int price, int money, int count) {
        long total = 0;
        for(int i = 1; i <= count; i++) {
            total += i * price;
        }
        return (money - total < 0) ? Math.abs(money - total) : 0;
    }

    public static void main(String[] args) {
        Answer02 test = new Answer02();
        System.out.println(test.solution(3, 20, 4));
    }
}