package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	/*1) Solicite um valor do teclado e exiba o seu 
	 sucesor*/
	 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor:");
		int numero=sc.nextInt();
		int sucessor=numero+1;
		System.out.print("O sucessor do n�mero digitado �: " + sucessor);
		sc.close();

	}

}
