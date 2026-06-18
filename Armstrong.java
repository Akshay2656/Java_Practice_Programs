import java.util.*;

public class Armstrong {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente number to check");
		int number = sc.nextInt();
		int sum = 0;
		int original = number;
		
		
		while (number != 0) {
			int digits = number % 10;
			sum += Math.pow(digits, 3);
			number = number / 10;
			
		}
		if (original == sum ) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not armstrong number");
		}
	}
}