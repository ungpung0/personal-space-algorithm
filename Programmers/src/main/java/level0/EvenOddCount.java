package level0;

public class EvenOddCount {

    // Solution Method.
    private int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int data : num_list) {
            if(data % 2 == 0) answer[0]++;
            else answer[1]++;
        }
        return answer;
    }
}
