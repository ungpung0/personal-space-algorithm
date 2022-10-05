package level0;

public class BacterialGrowth {

    // Solution Method.
    private int solution(int n, int t) {
        for(int i = 0; i < t; i++)
            n *= 2;
        return n;
    }
}
