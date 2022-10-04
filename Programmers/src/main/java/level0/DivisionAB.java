package level0;

public class DivisionAB {

    // Solution Method.
    public int solution(int num1, int num2) {
        Double answer = (double)num1 / num2 * 1000;
        return answer.intValue();
    }
}
