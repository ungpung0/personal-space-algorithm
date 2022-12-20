package level0;

public class Babbling {
    // Solution Method.
    private int solution(String[] babbling) {
        String[] template = {"aya", "ye", "woo", "ma"};

        int count = 0;
        for(int i = 0; i < babbling.length; i++) {
            String _babbling = babbling[i];
            for(int j = 0; j < template.length; j++) {
                int _count = 0;
                while(_babbling.contains(template[j])) {
                    _babbling = _babbling.replaceFirst(template[j], " ");
                    _count++;
                }
                if(_count > 1)
                    break;
            }
            String[] _split = _babbling.split("");
            boolean flag = true;
            for(String _temp : _split) {
                if(!_temp.isBlank()) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                count++;
        }

        return count;
    }

    // Improved Method.
    private int others(String[] babbling) {
        String[] template = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < template.length; j++) {
                babbling[i] = babbling[i].replace(template[j], "1");
            }
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].isEmpty()) {
                count++;
            }
        }
        return count;
    }

    // Test Main Method.
    public static void main(String[] args) {
        String[] test1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] test2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        Babbling test = new Babbling();

        System.out.println(test.solution(test1));
        System.out.println(test.solution(test2));
    }
}
