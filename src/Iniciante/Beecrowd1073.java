package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1073 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i=1; i<=num; i++) {
            if (i % 2 == 0) {
                
                System.out.println(i + "^2 = " + (i * i));
            }
        }

        scan.close();
    }
}
