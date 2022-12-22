package level0;

import java.util.Arrays;

public class CloseNumber {
    // Solution Method.
    private int solution(int[] array, int n) {
        Arrays.sort(array);

        int answer = array[0], temp = Math.abs(array[0] - n);

        for(int i = 0; i < array.length; i++) {
            int _temp = Math.abs(array[i] - n);
            if(temp > _temp) {
                temp = _temp;
                answer = array[i];
            }
        }

        return answer;
    }

    // Test Main Method.
    public static void main(String[] args) {
        CloseNumber test = new CloseNumber();

        int[] array = {10, 30};
        int number = 20;

        System.out.println(test.solution(array, number));
    }
}
