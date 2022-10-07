package level0;

public class AlienPlanetAge {

    // Solution Method.
    private String solution(int age) {
        char[] translate = String.valueOf(age).toCharArray();
        for(int i = 0; i < translate.length; i++)
            translate[i] += 49;
        return new String(translate);
    }
}
