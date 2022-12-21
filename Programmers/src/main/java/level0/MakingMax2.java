package level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MakingMax2 {
    // Solution Method.
    private int solution(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        list.sort(Comparator.naturalOrder());

        int[] answer = new int[2];
        answer[0] = list.get(0) * list.get(1);
        answer[1] = list.get(list.size() - 1) * list.get(list.size() - 2);
        return answer[0] >= answer[1] ? answer[0] : answer[1];
    }

    // Others Good Solution.
    private int goodSolution(int[] numbers) {
        Arrays.sort(numbers);

        int edge = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int _edge = numbers[0] * numbers[1];

        return Math.max(edge, _edge);
    }
}
