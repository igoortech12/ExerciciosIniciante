package Exercicios_If_Else;

import java.util.Scanner;

public class Exercicio_Quatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LER HORÁRIO DE INÍCIO E TERMINO DE UM JOGO PARA DEPOIS 
		//CALCULAR A DURAÇÃO DO JOGO.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CALCULAR DURAÇÃO DE UM JOGO\n");
		System.out.println("OBSERVAÇÃO: PADRÃO DE HORÁRIO É DE 24H\n");
		System.out.println("DIGITE O HORÁRIO DE INÍCIO DO JOGO");
		int I = sc.nextInt();
		System.out.println("\nDIGITE O HORÁRIO DO TERMINO DO JOGO");
		int T = sc.nextInt();
		
		if (I < T) {
			System.out.println("\nO JOGO DUROU " + (T - I) + " HORA(S).");
		}
		else {
			if (I == 0 && T == 0) {
			System.out.println("\nO JOGO DUROU 24 HORA(S).");
		}
			else {
			System.out.println("\nO JOGO DUROU " + (24 - ( I - T)) + " HORA(S).");
			}
		sc.close();
	}

}
}
