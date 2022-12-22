package level0;

public class MakeTwoDimensionArray {
    // Solution Method.
    private int[][] solution(int[] num_list, int n) {
        final int m = num_list.length / n;
        int[][] answer = new int[m][n];

        int pointer = 0;
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < answer[i].length; j++) {
                answer[i][j] = num_list[pointer];
                pointer++;
            }
        }

        return answer;
    }
}
