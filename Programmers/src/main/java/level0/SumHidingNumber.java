package level0;

public class SumHidingNumber {

    // Solution Method.
    private int solution(String my_string) {
        char[] array = my_string.toCharArray();
        int result = 0;
        for(char data : array) {
            if(data > 47 && data < 58)
                result += data - 48;
        }
        return result;
    }

    // Test Method.
    public static void main(String[] args) {
        SumHidingNumber test = new SumHidingNumber();
        System.out.print(test.solution("aAb1B2cC34oOp"));
    }
}
