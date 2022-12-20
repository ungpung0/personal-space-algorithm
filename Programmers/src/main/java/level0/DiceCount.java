package level0;

public class DiceCount {
    // Solution Method.
    private int solution(int[] box, int n) {
        int horizon = box[0] / n;
        int vertical = box[1] / n;
        int height = box[2] / n;

        return horizon * vertical * height;
    }
}
