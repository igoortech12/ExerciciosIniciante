package Exercicios_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Sete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IDENTIFICAR QUAL QUADRANTE ESTÁ OS DOIS VALORES LIDOS
		//NO PLANO CARTESIANO.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----QUAL QUADRANTE?----\n");
		System.out.println("DIGITE A 1a COORDENADA");
		double x = sc.nextDouble();
		System.out.println("\nDIGITE A 2a COORDENADA");
		double y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("\nQUADRANTE 1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("\nQUADRANTE 2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("\nQUADRANTE 3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("\nQUADRANTE 4");
		}
		else {
			System.out.println("\nORIGEM");
		}
		sc.close();
	}

}
