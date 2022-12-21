package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindGreatestNumber {
    private int[] solution(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        int[] answer = new int[2];
        answer[0] = Collections.max(list);
        answer[1] = list.indexOf(answer[0]);

        return answer;
    }
}
