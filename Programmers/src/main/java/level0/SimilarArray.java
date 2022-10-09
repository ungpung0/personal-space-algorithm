package level0;

public class SimilarArray {

    // Solution Method.
    private int solution(String[] s1, String[] s2) {
        int count = 0;
        for(String data1 : s1) {
            for(String data2 : s2) {
                if(data1.equals(data2)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
