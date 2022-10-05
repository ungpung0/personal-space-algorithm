package level0;

import java.util.ArrayList;
import java.util.List;

public class ReturnFactor {

    // Solution Method.
    private int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++)
            if(n % i == 0) list.add(i);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
