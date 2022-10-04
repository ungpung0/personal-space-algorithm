package level0;

public class DeleteDuplicate {

    // Solution Method.
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int data : array) {
            answer += (data == n) ? 1 : 0;
        }
        return answer;
    }
}
