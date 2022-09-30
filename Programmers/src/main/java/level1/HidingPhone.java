package level1;

import java.util.Arrays;
import java.util.List;

public class HidingPhone {
    // Solution Method.
    public String solution(String phone_number) {
        List<String> list = Arrays.asList(phone_number.split(""));
        for(int i = 0; i < list.size() - 4; i++)
            list.set(i, "*");
        return String.join("", list);
    }

    // Test Method.
    public static void main(String[] args) {
        HidingPhone test = new HidingPhone();
        System.out.println(test.solution("01099992222"));
    }
}
