package Iniciante;

/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total 
percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a 
distância total percorrida (em Km), e um valor real Y representando o total de 
combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após 
a vírgula, seguido da mensagem "km/l". */


import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1014 {
    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int distancia = scan.nextInt();
        double combustivel = scan.nextDouble();

        double consumo = distancia / combustivel;

        System.out.printf("%.3f km/l%n", consumo);

        scan.close();
    }
}