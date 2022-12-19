package level0;

public class AntCorps {
    private int solution(int hp) {
        final int[] ANTS = {5, 3, 1};
        int count = 0;

        for(int i = 0; i < ANTS.length; i++) {
            count += hp / ANTS[i];

            if(hp % ANTS[i] != 0)
                hp %= ANTS[i];
            else
                break;
        }

        return count;
    }
}
