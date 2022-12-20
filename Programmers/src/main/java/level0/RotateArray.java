package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {
    // Solution Method.
    private int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        int _direction = (direction.equals("left")) ? -1 : 1;
        Collections.rotate(list, _direction);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
