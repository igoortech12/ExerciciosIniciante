package Exercicios_If_Else;

import java.util.Scanner;

public class Exercicio_Quatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LER HOR�RIO DE IN�CIO E TERMINO DE UM JOGO PARA DEPOIS 
		//CALCULAR A DURA��O DO JOGO.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CALCULAR DURA��O DE UM JOGO\n");
		System.out.println("OBSERVA��O: PADR�O DE HOR�RIO � DE 24H\n");
		System.out.println("DIGITE O HOR�RIO DE IN�CIO DO JOGO");
		int I = sc.nextInt();
		System.out.println("\nDIGITE O HOR�RIO DO TERMINO DO JOGO");
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
