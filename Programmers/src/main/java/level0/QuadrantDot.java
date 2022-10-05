package level0;

public class QuadrantDot {

    // Solution Method.
    public int solution(int[] dot) {
        int answer;
        if(dot[0] > 0)
            answer = (dot[1] > 0) ? 1 : 4;
        else
            answer = (dot[1] > 0) ? 2 : 3;
        return answer;
    }
}
