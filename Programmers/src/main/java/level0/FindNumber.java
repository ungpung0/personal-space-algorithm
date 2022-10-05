package level0;

public class FindNumber {

    // Solution Method.
    private int solution(int num, int k) {
        String number = String.valueOf(num);
        if(number.indexOf(String.valueOf(k)) == -1)
            return -1;
        else
            return number.indexOf(String.valueOf(k)) + 1;
    }
}
