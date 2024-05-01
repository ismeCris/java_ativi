package Exercicios;

import java.util.Scanner;

public class ImparPar {
	public static void main(String[]args) {
		int num;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe um numero:");
		num = leitor.nextInt();
		
		if(num %2 == 0) {
			System.out.println("o numero informado e par");
		}else {
			System.out.println("o numero informado e impar");
		}
		
		
		leitor.close();
	}
}
