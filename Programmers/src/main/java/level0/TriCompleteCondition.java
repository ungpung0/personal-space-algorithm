package level0;

import java.util.Arrays;

public class TriCompleteCondition {

    // Solution Method.
    private int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}
