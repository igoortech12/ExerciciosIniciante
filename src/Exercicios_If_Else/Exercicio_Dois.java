package Exercicios_If_Else;

import java.util.Scanner;

public class Exercicio_Dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LER UM N�MERO INTEIRO E SABER SE � PAR OU IMPAR
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE UM N�MERO INTEIRO");
		int x = sc.nextInt();
		
		if (x%2 == 0) {
			System.out.println("O N�MERO DIGITADO � PAR");
		}
		else {
			System.out.println("O N�MERO DIGITADO � IMPAR");
		}
		
		sc.close();
	}

}
