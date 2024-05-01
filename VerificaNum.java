package Exercicios;

import java.util.Scanner;

public class VerificaNum {
	public static void main(String[] args) {
		float num;
		
		Scanner lendo = new Scanner(System.in);
		System.out.println("digite um numero:");
		num = lendo.nextFloat();
		
		if(num >= 1) {
			System.out.println("o numero é positivo");
		}else if(num == 0) {
			System.out.println("o numero é igual a zero");
		}else if(num < 0) {
			System.out.println("o numero é negativo");
		}
		
		lendo.close();
	}

}
