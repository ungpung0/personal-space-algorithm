package level0;

public class DividePizza {
    // Solution Method.
    private int solution(int slice, int n) {
        int answer = (n % slice == 0) ? n / slice : n / slice + 1;
        return answer;
    }
}
