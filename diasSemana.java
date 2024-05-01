package Exercicios;

import java.util.Scanner;

public class DiasSemana {
	public static void main( String[] args) {
		
		int dia;
		Scanner le =new Scanner(System.in);
		System.out.println("informe o dia da semana");
		dia = le.nextInt();
		
		switch(dia) {
		
		case 1:
			System.out.println("Domingo: fim de semana");
			break;
		case 2:
			System.out.println("Segunda: dia ultil");
			break;
		case 3:
			System.out.println("Terça: dia ultil");
			break;
		case 4:
			System.out.println("Quarta: dia ultil");
			break;
		case 5:
			System.out.println("Quinta: dia ultil");
			break;
		case 6:
			System.out.println("Sexta: dia ultil");
			break;
		case 7:
			System.out.println("Sabado: fim de semana");
			break;
		default:
			System.out.println("numero invalido");
		}
		
		le.close();
	}

}
