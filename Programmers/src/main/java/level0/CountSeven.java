package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountSeven {
    // Solution Method.
    private int solution(int[] array) {
        final int SEVEN = 7;
        int answer = 0;

        String temp = Arrays.toString(array).replaceAll("[^0-9]", "");
        for(int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) == '7')
                answer++;
        }

        return answer;
    }

    // Others Good Solution.
    private int goodSolution(int[] array) {
        return (int) Arrays.stream(
                Arrays.stream(array)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining())
                        .split("")
                )
                .filter(s -> s.equals("7"))
                .count();
    }
}
