package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1)  Escreva um algoritmo para ler as dimens�es de um trap�zio (base amior, base menor e altura), 
		 * calcular e escrever a �rea do trap�zio. a=(B+b).h/2
		 */
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base maior");
		float basemaior=sc.nextFloat();
		
		System.out.println("Digite a base menor");
		float basemenor=sc.nextFloat();
		
		System.out.println("Digite a altura");
		float altura=sc.nextFloat();
		
		float trapezio=(basemaior+basemenor)*altura/2;
		System.out.println("O �rea do trap�zio corresponde a: " +trapezio);
		
		
		sc.close();
	}

}
