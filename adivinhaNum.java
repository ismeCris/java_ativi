package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class divinhaNum {
	public static void main( String[] args) {
		Scanner leitor =new Scanner(System.in);
		Random random = new Random();
		
		int gerador = random.nextInt(100)+1;
		int tentativa;
		System.out.println("adivinhe o numero de 1 a 100:");
		do{
			 tentativa = leitor.nextInt();
			 
			 if(tentativa > gerador) {
				  System.out.println("Tente um número menor:");
			 }else if(tentativa < gerador) {
				  System.out.println("Tente um número maior:");
			 } else {
	                System.out.println("Parabéns! Você acertou o número.");
	            }
			 
			
		} while(tentativa != gerador);
		
		
		leitor.close();
	}
}
