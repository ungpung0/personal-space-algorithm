package level0;

public class Protractor {

    // Solution Method.
    private int solution(int angle) {
        int answer;
        if(angle <= 90)
            answer = (angle == 90) ? 2 : 1;
        else
            answer = (angle == 180) ? 4 : 3;
        return answer;
    }
}
