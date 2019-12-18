package Exercicios_If_Else;

import java.util.Scanner;

public class Exercicio_Dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LER UM NÚMERO INTEIRO E SABER SE É PAR OU IMPAR
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE UM NÚMERO INTEIRO");
		int x = sc.nextInt();
		
		if (x%2 == 0) {
			System.out.println("O NÚMERO DIGITADO É PAR");
		}
		else {
			System.out.println("O NÚMERO DIGITADO É IMPAR");
		}
		
		sc.close();
	}

}
