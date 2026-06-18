public class Armstrong {
	
	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		int original = num;
		
		
		while (num != 0) {
			int digits = num % 10;
			sum += Math.pow(digits, 3);
			num = num / 10;
			
		}
		if (original == sum ) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not armstrong number");
		}
	}
}