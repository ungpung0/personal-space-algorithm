package level0;

public class PrimeNumberGame {

    // Solution Method.
    private int solution(int order) {
        String[] array = String.valueOf(order).split("");
        int count = 0;
        for(String data : array) {
            int parse = Integer.parseInt(data);
            if(parse % 3 == 0 && parse != 0)
                count++;
        }
        return count;
    }

    // Test Method.
    public static void main(String[] args) {
        PrimeNumberGame test = new PrimeNumberGame();
        System.out.println(test.solution(1234567890));
    }
}
