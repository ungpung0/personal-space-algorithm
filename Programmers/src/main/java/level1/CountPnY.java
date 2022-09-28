package level1;

public class CountPnY {

    // Solution Method.
    boolean solution(String s) {
        boolean answer;
        int pCount = 0, yCount = 0;
        String[] array = s.toUpperCase().split("");

        for(int i = 0; i < array.length; i++) {
            if(array[i].equals("P"))
                pCount++;
            else if(array[i].equals("Y"))
                yCount++;
        }

        if(pCount == 0 && yCount == 0)
            answer = true;
        else
            answer = ((pCount - yCount) == 0) ? true : false;

        return answer;
    }

    public static void main(String[] args) {
        CountPnY test = new CountPnY();
        System.out.println(test.solution("PP"));
    }

}
