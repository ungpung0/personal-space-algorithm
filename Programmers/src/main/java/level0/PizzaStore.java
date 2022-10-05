package level0;

public class PizzaStore {

    // Solution Method.
    public int solution(int n) {
        final double PIZZA_COUNT = 7.0;
        return (int)Math.ceil(n / PIZZA_COUNT); // 정수형을 실수형으로 나눌 때 값이 올바르다.
    }
}
