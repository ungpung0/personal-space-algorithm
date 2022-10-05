package level0;

public class RemoveVowel {

    // Solution Method.
    private String solution(String my_string) {
        String[] vowel = {"a", "e", "i", "o", "u"};
        for(String data : vowel)
            my_string = my_string.replace(data, "");
        return my_string;
    }

    public static void main(String[] args) {
        RemoveVowel test = new RemoveVowel();
        System.out.print(test.solution("nice to meet you"));
    }
}
