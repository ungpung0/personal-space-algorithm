package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleOfN {
    // Solution Method.
    private int[] solution(int n, int[] numlist) {
        List<Integer> _numlist = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                _numlist.add(numlist[i]);
            }
        }
        return _numlist.stream().mapToInt(Integer::intValue).toArray();
    }

    // Others Good Solution.
    private int[] goodSolution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
    }
}
