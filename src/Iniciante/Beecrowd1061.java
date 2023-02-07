package Iniciante;

/*Pedrinho está organizando um evento em sua Universidade. O evento deverá 
ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que 
Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe 
quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você 
deverá ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um 
espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será 
informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. 
Na terceira e quarta linha de entrada haverá outra informação no mesmo 
formato das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração 
mínima de 1 minuto. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1061 {
    public static void main(String[] args) throws IOException {
        
		Scanner scan = new Scanner(System.in);
		
		int W1, X1, Y1, Z1, W2, X2, Y2, Z2, W, X, Y, Z, inicio, fim, duracao, resto;
		String s;

		s = scan.next();
		W1 = scan.nextInt();
		X1 = scan.nextInt();
		s = scan.next();
		Y1 = scan.nextInt();
		s = scan.next();
		Z1 = scan.nextInt();
		s = scan.next();
		W2 = scan.nextInt();
		X2 = scan.nextInt();
		s = scan.next();
		Y2 = scan.nextInt();
		s = scan.next();
		Z2 = scan.nextInt();
		
		inicio = W1*24*60*60 + X1*60*60 + Y1*60 + Z1;
		fim = W2*24*60*60 + X2*60*60 + Y2*60 + Z2;
		duracao = fim - inicio;
		
		W = duracao / (24*60*60);
		resto = duracao % (24*60*60);
		X = resto / (60*60);
		resto = resto % (60*60);
		Y = resto / 60;
		Z = resto % 60;
		
		System.out.println(W + " dia(s)");
		System.out.println(X + " hora(s)");
		System.out.println(Y + " minuto(s)");
		System.out.println(Z + " segundo(s)");	

        scan.close();
    }
}
