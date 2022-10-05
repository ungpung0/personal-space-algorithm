package level0;

import java.util.ArrayList;
import java.util.List;

public class CutArray {

    // Solution Method.
    private int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> list = new ArrayList<>();
        for(int i = num1; i <= num2; i++)
            list.add(numbers[i]);
        return list.stream().mapToInt(Integer::intValue).toArray();
        // copyOfRange를 사용하면 인덱스를 범위로 배열을 자를 수 있다.
    }
}
