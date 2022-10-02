package level1;

public class DotProduct {

    // Solution Method.
    public int solution(int[] a, int[] b) {
        int result = 0; final int LENGTH = a.length;
        for(int i = 0; i < LENGTH; i++) {
            result += a[i] * b[i];
        }
        return result;
    }
}
