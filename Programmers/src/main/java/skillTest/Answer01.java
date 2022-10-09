package skillTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Answer01 {

    private int[] solution(int[] array, int[][] commands) {
        final int COMMAND_LENGTH = commands.length;
        int[] answer = new int[COMMAND_LENGTH];
        for(int i = 0; i < COMMAND_LENGTH; i++) {
            int first = commands[i][0] - 1;
            int last = commands[i][1];
            int index  = commands[i][2];

            List<Integer> list = new ArrayList<>();
            for(int j = first; j < last; j++)
                list.add(array[j]);
            list.sort(Comparator.naturalOrder());
            answer[i] = list.get(index - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Answer01 test = new Answer01();
        int[] _array = {1, 5, 2, 6, 3, 7, 4};
        int[][] _command = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] array = test.solution(_array, _command);
    }
}
