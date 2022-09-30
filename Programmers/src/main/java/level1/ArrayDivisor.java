package level1;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayDivisor {

    // Solution Method.
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int data : arr) {
            if(data % divisor == 0)
                arrayList.add(data);
        }
        if(arrayList.size() == 0) {
            return new int[] {-1};
        }else {
            arrayList.sort(Comparator.naturalOrder());
            return arrayList.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
