package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Solicite o valor da Divis�o
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero");
		
		float num1=sc.nextFloat();
		
		System.out.print("Digite um outro numero");
		
		float num2=sc.nextFloat();
		float divis�o=num1/num2;
		
		System.out.println("A divis�o dos valores �:" + divis�o);
		
		sc.close();
	}

}
