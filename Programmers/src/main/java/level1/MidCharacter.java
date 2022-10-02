package level1;

public class MidCharacter {

    // Solution Method.
    public String solution(String s) {
        int index = s.length() / 2;
        if(s.length() % 2 == 0)
           return s.substring(index - 1, index + 1);
        else
            return String.valueOf(s.charAt(index));
    }

    // Test Method.
    public static void main(String[] args) {
        MidCharacter test = new MidCharacter();
        System.out.println(test.solution("abcdef"));
    }
}
