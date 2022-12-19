package level0;

public class CountOrderedPair {
    // Solution Method.
    private int solution(int n) {
        int limit = n / 2, count = 1;
        for(int i = 1; i <= limit; i++) {
            if(n % i == 0)
                count++;
        }
        return count;
    }
}
