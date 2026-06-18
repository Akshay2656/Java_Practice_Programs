public class IncrementCalculation {
	public static void main(String[] args) {
		double salary = 10000;
		int yearsOfExp = 10;
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