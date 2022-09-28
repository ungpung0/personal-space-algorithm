package level1;

public class Average {

    // Solution Method.
    public double solution(int[] arr) {
        double answer = 0;
        final int ARR_LENGTH = arr.length;

        for(int i = 0; i < ARR_LENGTH; i++) {
            answer += arr[i];
            if(i == ARR_LENGTH - 1)
                answer /= ARR_LENGTH;
        }

        return answer;
    }

}
