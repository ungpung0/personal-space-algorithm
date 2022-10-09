package level0;

public class Mossugi {

    // Solution Method.
    private int solution(int[] array, int height) {
        int count = 0;
        for(int data : array)
            if(height < data) {
                count++;
            }
        return count;
    }
}
