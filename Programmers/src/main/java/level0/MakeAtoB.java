package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MakeAtoB {

    // Solution Method.
    private int solution (String before, String after) {
        before = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        after = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());
        return before.equals(after) ? 1 : 0;
    }
}
