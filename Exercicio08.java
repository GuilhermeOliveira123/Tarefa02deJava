package exercicios;


import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1)  Escreva um algoritmo para ler as dimens�es de um tri�ngulo (base e altura), 
		 * calcular e escrever a �rea do tri�ngulo. Dica a=b.h/2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base");
		float base=sc.nextFloat();
		
		System.out.println("Digite a altura");
		float altura=sc.nextFloat();
		
		float triangulo=base*altura/2;
		
		System.out.println("O valor do triangulo �: " +triangulo);
		sc.close();
		

	}

}
