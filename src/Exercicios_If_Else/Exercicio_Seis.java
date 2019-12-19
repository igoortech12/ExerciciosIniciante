package Exercicios_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LER VALOR QUALQUER E APRESENTAR UMA MSG DIZENDO EM QUAL DOS
		//SEGUINTES INTERVALOS ([0,25], (25,50], (50,75], (75,100]) O
		//VALOR SE ENCONTRA.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("DIGITE UM VALOR");
		double valor = sc.nextDouble();
		
		if (valor < 0 || valor > 100) {
			System.out.println("Fora de intervalo");
		}
		else if (valor <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if (valor <= 50) {
			System.out.println("Intervalo [25,50]");
		}
		else if (valor <= 75) {
			System.out.println("Intervalo [50,75]");
		}
		else if (valor <= 100) {
			System.out.println("Intervalo [75,100]");
		}
		
		
		sc.close();
	}

}
