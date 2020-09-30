import java.util.Locale;
import java.util.Scanner;

public class secao04Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codpec1, codpec2;
		int qtdpec1, qtdpec2;
		double vlrpec1, vlrpec2, vlrtotal;
		
		codpec1 = sc.nextInt();
		qtdpec1 = sc.nextInt();
		vlrpec1 = sc.nextDouble();
		sc.nextLine();
		codpec2 = sc.nextInt();
		qtdpec2 = sc.nextInt();
		vlrpec2 = sc.nextDouble();
		
		vlrtotal = (qtdpec1 * vlrpec1) + (qtdpec2 * vlrpec2);
		
		System.out.printf("VALOR A PAGAR: = R$ %.2f", vlrtotal);
	
		sc.close();
	}

}
