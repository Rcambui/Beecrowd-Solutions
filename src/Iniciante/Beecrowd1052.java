package Iniciante;

/*Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor,
deve ser apresentado como resposta o mês do ano por extenso, em inglês, com 
a primeira letra maiúscula.

Entrada
A entrada contém um único valor inteiro.

Saída
Imprima por extenso o nome do mês correspondente ao número existente na 
entrada, com a primeira letra em maiúscula. */


import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1052 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String mes = " ";

        switch (num) {
            case 1: mes = "January"; break;
            case 2: mes = "February"; break;
            case 3: mes = "March"; break;
            case 4: mes = "April"; break;
            case 5: mes = "May"; break;
            case 6: mes = "June"; break;
            case 7: mes = "July"; break;
            case 8: mes = "August"; break;
            case 9: mes = "September"; break;
            case 10: mes = "October"; break;
            case 11: mes = "November"; break;
            case 12: mes = "December"; break;
        }

        System.out.println(mes);

        scan.close();
    }
}
