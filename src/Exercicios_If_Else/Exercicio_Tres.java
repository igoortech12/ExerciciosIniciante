package Exercicios_If_Else;

import java.util.Scanner;

public class Exercicio_Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LER DOIS VALORES INTEIROS E MOSTRAR SE SÃO MULTIPLOS OU NÃO

		Scanner sc = new Scanner(System.in);

		System.out.println("ESSES NÚMEROS SÃO MULTIPLOS???\n");
		System.out.println("DIGITE O PRIMEIRO NÚMERO");
		int A = sc.nextInt();
		System.out.println("DIGITE O SEGUNDO NÚMERO");
		int B = sc.nextInt();

		if (A == 2 * B) {
			System.out.println("OS NÚMEROS DIGITADOS SÃO MULTIPLOS");
		} else {
			System.out.println("OS NÚMEROS DIGITADOS NÃO SÃO MULTIPLOS");
		}
		sc.close();
	}

}
