package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortString {
    // Solution Method.
    private int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if(temp <= 57 && temp >= 48) {
                list.add(temp - 48);
            }
        }
        list.sort(Comparator.naturalOrder());

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // Others Good Solution.
    private int[] goodSolution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}