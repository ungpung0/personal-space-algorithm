package level1;

public class NegativePositive {

    public int solution(int[] absolutes, boolean[] signs) {
        int result = 0; final int LENGTH = absolutes.length;
        for(int i = 0; i < LENGTH; i++) {
            if(signs[i] == true)
                result += absolutes[i];
            else
                result -= absolutes[i];
        }
        return result;
    }
}
