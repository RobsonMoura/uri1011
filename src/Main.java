import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, v;
		
		R = sc.nextDouble();
		
		v = ((double)4/3) * 3.14159 * (R * R * R);
		
		System.out.printf("VOLUME = %.3f%n", v);
		
		sc.close();
		
	}

}
