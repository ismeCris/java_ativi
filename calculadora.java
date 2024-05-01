package Exercicios;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[]args) {
		
	
	
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite o primeiro valor:");
		double num1 = leitor.nextDouble();
		
		System.out.println("digite o segundo valor:");
		double num2 = leitor.nextDouble();
		
		System.out.println("digite o operador:");
		char operador = leitor.next().charAt(0);
		
		leitor.close();
		
		double resultado;
		
		switch(operador) {
		
			case'+':
				 resultado = num1 + num2;
				 break;
			case'-':
				 resultado = num1 - num2;
				 break;
			case'*':
				 resultado = num1 * num2;
				 break; 
			case'/':
				 resultado = num1 / num2;
				 break;
			default:
				System.out.println("operacao invalida");
				return;
		}
		

	      System.out.println(num1+" "+operador+" "+num2+":  "+resultado);
	}
		
		
		

}
