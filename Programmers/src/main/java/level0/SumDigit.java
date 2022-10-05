package level0;

public class SumDigit {

    // Solution Method.
    public int solution(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split("");
        for(String data : array) answer += Integer.parseInt(data);
        return answer;
    }
}
