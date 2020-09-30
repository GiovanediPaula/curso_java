import java.util.Locale;
import java.util.Scanner;

public class estruturaCondicionalDiaSemanaSwitchCase {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

}
