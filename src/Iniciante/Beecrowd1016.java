package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1016 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int km = scan.nextInt();
        int distancia = km * 2;

        System.out.println(distancia + " minutos");

        scan.close();
    }
}
