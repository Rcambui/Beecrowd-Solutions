package Iniciante;

/* */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1079 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        double num1, num2, num3, media;

        for (int i=0; i<N; i++) {
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();
            num3 = scan.nextDouble();
            media = (num1*2 + num2*3 + num3*5) / 10.0;
            System.out.printf("%.1f%n", media);
        }

        scan.close();
    }
}
