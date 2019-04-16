package One;
import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tax = 0.5;
		System.out.println("ENTER WITHDRAWAL AMOUNT");
		double withdrawal = sc.nextDouble();
		System.out.println("ENTER BALANCE");
		double bal = sc.nextDouble();
		
		if(withdrawal % 5 == 0 && bal >= (withdrawal + 0.5))
			System.out.println(bal - withdrawal - 0.5);
		else if(withdrawal % 5 != 0 && bal >= (withdrawal + 0.5)) {
			System.out.println(bal);
			System.out.println("Invalid amount");
		}
		else {
			System.out.println(bal);
			System.out.println("Not Enough balance");
		}
	}
}
