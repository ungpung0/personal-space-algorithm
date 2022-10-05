package level0;

public class UpperLowerConversion {

    // Solution Method.
    private String solution(String my_string) {
        final int COMPARE = 32;
        char[] array = my_string.toCharArray();
        for(int i = 0; i < array.length; i++)
            array[i] += (array[i] >= 97) ? -COMPARE : COMPARE;
        return new String(array); // char[] -> String
    }

    // Test Method.
    public static void main(String[] args) {
        UpperLowerConversion test = new UpperLowerConversion();
        System.out.println(test.solution("cccCCC"));
    }
}
