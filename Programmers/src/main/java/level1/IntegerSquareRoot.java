package level1;

public class IntegerSquareRoot {

    // Solution Method.
    public long solution(long n) {
        long answer = 0;
        double number = Math.sqrt(n);

        if(number == (long)number) {
            answer = (long)Math.pow(number + 1, 2);
        }else {
            answer = -1;
        }

        return answer;
    }

}
