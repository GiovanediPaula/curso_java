import java.util.Locale;
import java.util.Scanner;

public class secao04Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFEREN�A = " + DIFERENCA);
		
		sc.close();
	}

}
