package Exercicios;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[]args) {
		
		int num;
		long fatorial = 1;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe um numero inteiro:");
		num = leitor.nextInt();
		
        int i = 1;
        while (i <= num) {
            fatorial *= i;
            i++;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
	}

}
