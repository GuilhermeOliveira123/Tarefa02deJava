package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1)  Escreva um algoritmo para ler as dimens�es de um circulo (raio), calcular e 
		 * escrever a �rea do circulo. a=pi*r�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		   System.out.println("Escreva o valor do raio");
	       Scanner scan = new Scanner(System.in);

	       double raio = scan.nextFloat();
	       double area = Math.PI * raio * raio;

	       System.out.println("O valor da area � " + area);
	       
	       sc.close();

	}

}
