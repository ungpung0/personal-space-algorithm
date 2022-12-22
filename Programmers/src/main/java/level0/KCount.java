package level0;

public class KCount {
    // Solution Method.
    private int solution(int i, int j, int k) {
        int answer = 0;

        for(int it = i; it <= j; it++) {
            String[] temp = (it + "").split("");

            for(int ti = 0; ti < temp.length; ti++) {
                if(temp[ti].contains(k + ""))
                    answer++;
            }
        }

        return answer;
    }

    // Others Good Solution.
    private int goodSolution(int i, int j, int k) {
        String str = "";
        for(int it = i; it < j; it++) {
            str += it + "";
        }

        return str.length() - str.replace(k + "", "").length();
    }


    // Test Main Method.
    public static void main(String[] args) {
        KCount test = new KCount();
        System.out.println(test.solution(1, 13, 1));
    }
}
