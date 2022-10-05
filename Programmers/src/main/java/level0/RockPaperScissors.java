package level0;

public class RockPaperScissors {

    // Solution Method.
    public String solution(String rsp) {
        String[] array = rsp.split("");
        final String ROCK = "0", PAPER = "5", SCISSOR = "2";
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(ROCK))
                array[i] = PAPER;
            else
                array[i] = (array[i].equals(SCISSOR)) ? ROCK : SCISSOR;
        }
        return String.join("", array);
    }
}
