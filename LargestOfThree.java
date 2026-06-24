import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		System.out.println("enter 3rd Number");
		int c = sc.nextInt();
		
		int max = Math.max(a, Math.max(b,c));
		System.out.println("Max Number is: "+max);
		
	}
}