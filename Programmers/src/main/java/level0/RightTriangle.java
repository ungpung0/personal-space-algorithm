package level0;

import java.util.Scanner;

public class RightTriangle {

    // Solution Method.
    private void Solution() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for(int i = 1; i <= count; i++) {
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
