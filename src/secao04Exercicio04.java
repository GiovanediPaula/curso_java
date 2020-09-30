import java.util.Locale;
import java.util.Scanner;

public class secao04Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num_fun, num_hor;
		double val_sal, val_hor;
		
		num_fun = sc.nextInt();
		num_hor = sc.nextInt();
		val_hor = sc.nextDouble();
		
		val_sal = num_hor * val_hor;
		
		System.out.println("NUMBER = " + num_fun);
		System.out.printf("SALARY = $ %.2f", val_sal);
		
		sc.close();
	}

}
