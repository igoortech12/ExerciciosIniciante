package Exercicios_If_Else;

import java.util.Scanner;

public class Exercicio_Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LER DOIS VALORES INTEIROS E MOSTRAR SE S�O MULTIPLOS OU N�O

		Scanner sc = new Scanner(System.in);

		System.out.println("ESSES N�MEROS S�O MULTIPLOS???\n");
		System.out.println("DIGITE O PRIMEIRO N�MERO");
		int A = sc.nextInt();
		System.out.println("DIGITE O SEGUNDO N�MERO");
		int B = sc.nextInt();

		if (A == 2 * B) {
			System.out.println("OS N�MEROS DIGITADOS S�O MULTIPLOS");
		} else {
			System.out.println("OS N�MEROS DIGITADOS N�O S�O MULTIPLOS");
		}
		sc.close();
	}

}
