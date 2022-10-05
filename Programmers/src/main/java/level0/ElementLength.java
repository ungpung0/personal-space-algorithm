package level0;

import java.util.ArrayList;
import java.util.List;

public class ElementLength {

    // Solution Method.
    public int[] solution(String[] strlist) {
        List<Integer> list = new ArrayList<>();
        for(String data : strlist) list.add(data.length());
        return list.stream().mapToInt(Integer::intValue).toArray(); // 스트림을 통해 변환.
    }
}
