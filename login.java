package Exercicios;

import java.util.Scanner;

public class Login {
	public static void main(String[]agrs) {
		
		Scanner leitor = new Scanner(System.in);
		String username = "adm";
		String senha = "123456";
		
		System.out.println("Digite o nome de usuário:");
		String inputusername = leitor.nextLine();
		
		System.out.println("Digite a senha:");
		String inputsenha = leitor.nextLine();
		
		
		if(inputusername.equals(username) && inputsenha.equals(senha)) {
			System.out.println("Login bem sucedido!");
		}else {
			System.out.println("Nome de usuario ou senha incorretos.");
		}
		
		leitor.close();
	}

}
