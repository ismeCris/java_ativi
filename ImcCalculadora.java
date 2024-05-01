import java.util.Scanner;

public class ImcCalculadora {
	
	public static void main(String[] args) {
		 
		double peso;
		double altura;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("informe seu peso:");
		peso = leia.nextDouble();
		
		System.out.println("informe sua altura:");
		altura = leia.nextDouble();
		
		double imc;
		
		imc = peso / (altura * altura);
		
		if(imc < 18.5) {
			System.out.println("Abaixo do peso");
		}else if(imc >=18.6 && imc<= 24.9) {
			System.out.println("Peso normal");
		}else if( imc >=25 && imc<=29.9) {
			System.out.println("Sobrepeso");
		}else if( imc >=30) {
			System.out.println("Obesidade, procure um medico");
		}
	}
}
