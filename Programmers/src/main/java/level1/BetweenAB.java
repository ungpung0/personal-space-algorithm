package level1;

public class BetweenAB {

    // Solution Method.
    public long solution(int a, int b) {
        if(a == b) {
            return a;
        }else {
            int max = (a > b) ? a : b;
            int min = (b > a) ? a : b;
            int result = 0;
            for(int i = min; i <= max; i++)
                result += i;
            return result;
        }
    }
}
