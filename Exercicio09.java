package exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Escreva um algoritmo para ler as dimens�es de um quadrado (lado), 
		 * calcular e escrever a �rea do quadrado. Dica a=l�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado do quadrado");
		int ladoquadrado = sc.nextInt();
		int area = ladoquadrado*4;
		
		System.out.println("A area do quadrado �:" + area);
		
		sc.close();
		
	}

}
