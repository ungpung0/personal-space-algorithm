package level1;

public class StringToInteger {

    // Solution Method.
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        StringToInteger test = new StringToInteger();
        System.out.println(test.solution("1234"));
        System.out.println(test.solution("-1234"));
    }

}
