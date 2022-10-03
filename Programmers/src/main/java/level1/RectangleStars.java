package level1;

import java.util.Scanner;

public class RectangleStars {

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        for(int i = 0; i < width; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
