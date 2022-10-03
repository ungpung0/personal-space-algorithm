package level1;

public class SumMatrix {

    // Solution Method.
    public int[][] solution(int[][] array1, int[][] array2) {
        int[][] answer = new int[array1.length][array1[0].length];
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1[i].length; j++) {
                answer[i][j] += array1[i][j] + array2[i][j];
            }
        }
        return answer;
    }
}
