package exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Solicite o valor da Multiplica��o
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int multiplica��o=num*num2;
		System.out.println("A multipli��o dos valores �" + multiplica��o);
		
		sc.close();
	}

}
