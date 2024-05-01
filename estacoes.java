package Exercicios;

import java.util.Scanner;

public class Estacoes {
	public static void main(String[]args) {
		int mes;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o mes( 1 a 12):");
		mes = leitor.nextInt();
		
		switch(mes) {
		case 12:
		case 1:
		case 2:
			System.out.println(" primavera");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(" outono");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(" inverno");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(" verao");
			break;
		}
		leitor.close();
		
	}

}
