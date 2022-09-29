package level1;

public class NListXSpace {

    // Solution Method.
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < answer.length; i++) {
            if(i == 0)
                answer[i] = x;
            else
                answer[i] = answer[i - 1] + x;
        }
        return answer;
    }

    public static void main(String[] args) {
        NListXSpace test = new NListXSpace();
        for(long data : test.solution(-4, 2))
            System.out.println(data);
    }
}
