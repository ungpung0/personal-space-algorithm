package level1;

public class EvenOdd {

    // Solution Method
    public String solution(int num) {
        String answer = "";

        if(num % 2 == 0) {
            answer="Even";
        }else {
            answer="Odd";
        }

        return answer;
    }

}
