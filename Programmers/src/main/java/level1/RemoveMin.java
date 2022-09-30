package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveMin {

    // Solution Method.
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[] {-1};
        }else {
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            list.remove(Collections.min(list));
            return list.stream().mapToInt(Integer::intValue).toArray();
        }

    }
}
