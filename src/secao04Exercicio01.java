import java.util.Scanner;

public class secao04Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, SOMA;
		
		System.out.printf("Digite o primeiro valor: ");		
		valor1 = sc.nextInt();
		System.out.printf("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		
		SOMA = valor1 + valor2;
		
		System.out.println("Soma " + SOMA);
		
		sc.close();
		
	}
}
