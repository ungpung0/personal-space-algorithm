package level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TreatmentOrder {
    // Solution Method.
    private int[] solution(int[] emergency) {
        final int LENGTH = emergency.length;
        int[] answer = new int[LENGTH];
        Arrays.fill(answer, LENGTH);

        for(int i = 0; i < LENGTH; i++) {
            for(int j = 0; j < LENGTH; j++) {
                if(emergency[i] > emergency[j]) {
                    answer[i]--;
                }
            }
        }

        return answer;
    }

    // Others Good Solution.
    private int[] goodSolution(int[] emergency) {
        return Arrays.stream(emergency)
                .map(i -> Arrays.stream(emergency)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList())
                        .indexOf(i) + 1).toArray();
    }

    // Test Main Method.
    public static void main(String[] args) {
        TreatmentOrder test = new TreatmentOrder();

        int[] case1 = {3, 76, 24};

        System.out.println(test.solution(case1));
    }
}
