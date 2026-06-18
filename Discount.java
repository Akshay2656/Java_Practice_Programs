public class Discount {
	public static void main(String[] args) {
		String[] listItem = {"Mobile", "Laptop", "Mouse", "Keyboard"};
		double[] price = {30000, 50000, 2000, 3000};
		double[] discount = {0.10, 0.20, 0.02, 0.05};
		int[] quantity = {3, 2, 4, 2};

		for(int i = 0; i < price.length; i++){
			double discountAmount = price[i] * discount[i];
			double finalPrice = price[i] - discountAmount;
			double overAllPrice = finalPrice * quantity[i];
			
			System.out.println("Item            : "+listItem[i]);
			System.out.println("Price           : "+price[i]);
			System.out.println("Discount Amount : "+discountAmount);
			System.out.println("Final Price     : "+finalPrice);
			System.out.println("Quantity        : "+quantity[i]);
			System.out.println("Overall Price   : "+overAllPrice);
			System.out.println("==================================");
		}
	}
}
