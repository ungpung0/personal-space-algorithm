package level1;

public class WaterMelon {

    // Solution Method.
    public String solution(int n) {
        String result = "";
        for(int i = 0; i < n / 2; i++) result += "수박";
        if(n % 2 != 0) result += "수";
        return result;
    }
}
