package Exercicios_If_Else;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PROGRAMA QUE LEIA O G�DIGO  DE UM ITEM E A QUANTIDADE DESTE ITEM.
		//DEPOIS CALCULAR E MOSTRAR O VALOR DA CONTA
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------TABELA DE PRODUTOS---------");
		System.out.println("------------------------------------");
		System.out.println("|C�DIGO -   ESPECIFICA��O -  PRE�O |");
		System.out.println("------------------------------------");
		System.out.println("|  1    - Cachorro Quente - R$ 4.00|");
		System.out.println("|  2    - X-Salada        - R$ 4.50|");
		System.out.println("|  3    - X-Bacon         - R$ 5.00|");
		System.out.println("|  4    - Torrada simples - R$ 2.00|");
		System.out.println("|  5    - Refrigerante    - R$ 1.50|");
		System.out.println("|----------------------------------|");
		System.out.println("\n\nPOR FAVOR, ESCOLHA UM PRODUTO.");
		int C�DIGO = sc.nextInt();
		System.out.println("\nPOR FAVOR, DIGITE A QUANTIDADE QUE DESEJA");
		int QUANTIDADE = sc.nextInt();
		
		if (C�DIGO == 1) {
			System.out.printf("\nTOTAL � DE: R$" + (4.00 * QUANTIDADE));
		}
		else {
			if (C�DIGO == 2) {
				System.out.printf("\nTOTAL � DE: R$" + (4.50 * QUANTIDADE));
			}
			if (C�DIGO == 3) {
				System.out.printf("\nTOTAL � DE: R$" + (5.00 * QUANTIDADE));
			}
			if (C�DIGO == 4) {
				System.out.printf("\nTOTAL � DE: R$" + (2.00 * QUANTIDADE));
			}
			if (C�DIGO == 5) {
				System.out.printf("\nTOTAL � DE: R$" + (1.50 * QUANTIDADE));
			}
		}
				
		sc.close();
	}

}
