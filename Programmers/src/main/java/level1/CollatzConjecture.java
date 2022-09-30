package level1;

public class CollatzConjecture {

    // Solution Method.
    public int solution(long num) {
        if(num == 1) {
            return 0;
        }else {
            int count = 0;
            final int MAX = 500;
            while(num != 1) {
                num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
                if(count == MAX) {
                    count = -1;
                    break;
                }
                count++;
            }
            return count;
        }
    }

    // Test Method.
    public static void main(String[] args) {
        CollatzConjecture test = new CollatzConjecture();
        System.out.println(test.solution(626331));
    }
}
