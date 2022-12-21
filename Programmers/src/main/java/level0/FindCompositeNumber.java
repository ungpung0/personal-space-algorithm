package level0;

import java.util.stream.IntStream;

public class FindCompositeNumber {
    // Solution Method.
    private int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            int _temp = 0;
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0)
                    _temp++;
            }
            if(_temp > 2)
                answer++;
        }

        return answer;
    }

    // Others Good Solution.
    private int goodSolution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> (int) IntStream.rangeClosed(1, i)
                        .filter(i2 -> i % i2 == 0).count() > 2).count();
    }
}
