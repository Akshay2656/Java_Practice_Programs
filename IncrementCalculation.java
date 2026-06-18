import java.util.*;

public class IncrementCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary");
		double salary = sc.nextDouble();
		
		System.out.println("Enter your Years Of Experience");
		int yearsOfExp = sc.nextInt();
		
		double increment = 0;
		
		if (yearsOfExp >= 5) {
			increment = salary * 0.15;
			System.out.println("Offered Salary: "+(increment + salary));
		}else {
			increment = salary * 0.10;
			System.out.println("Offered Salary: "+(increment + salary));
		}
	}
}