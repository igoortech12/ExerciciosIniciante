package Exercicios_If_Else;

import java.util.Scanner;

public class Exercicio_Um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EXERCICIO PARA DESCOBRIR SE O NUMERO
		//DIGITADO � POSITIVO OU NEGATIVO
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE UM N�MERO INTEIRO");
		int x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("O N�MERO DIGITADO � POSITIVO");
		}
		else {
			System.out.println("O N�MERO DIGITADO � NEGATIVO");
		}
		
		sc.close();
	}

}
