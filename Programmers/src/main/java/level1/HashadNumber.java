package level1;

public class HashadNumber {

    // Solution Method.
    public boolean solution(int x) {
        String[] array = String.valueOf(x).split("");
        int total = 0;
        for(String data : array) {
            total += Integer.parseInt(data);
        }

        boolean answer = (x % total == 0) ? true : false;
        return answer;
    }
}
