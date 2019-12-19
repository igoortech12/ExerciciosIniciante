package Exercicios_If_Else;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PROGRAMA QUE LEIA O GÓDIGO  DE UM ITEM E A QUANTIDADE DESTE ITEM.
		//DEPOIS CALCULAR E MOSTRAR O VALOR DA CONTA
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------TABELA DE PRODUTOS---------");
		System.out.println("------------------------------------");
		System.out.println("|CÓDIGO -   ESPECIFICAÇÃO -  PREÇO |");
		System.out.println("------------------------------------");
		System.out.println("|  1    - Cachorro Quente - R$ 4.00|");
		System.out.println("|  2    - X-Salada        - R$ 4.50|");
		System.out.println("|  3    - X-Bacon         - R$ 5.00|");
		System.out.println("|  4    - Torrada simples - R$ 2.00|");
		System.out.println("|  5    - Refrigerante    - R$ 1.50|");
		System.out.println("|----------------------------------|");
		System.out.println("\n\nPOR FAVOR, ESCOLHA UM PRODUTO.");
		int C = sc.nextInt();
		System.out.println("\nPOR FAVOR, DIGITE A QUANTIDADE QUE DESEJA");
		int Q = sc.nextInt();
		System.out.println("\nTOTAL É DE: R$");		
	
		sc.close();
	}

}
