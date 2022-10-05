package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateEven {

    // Solution Method.
    private int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i+=2)
            list.add(i);
        return Arrays.stream(list.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
    }

}
