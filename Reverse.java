class Reverse{
	public static void main(String[] args){
		int num = 1234;
		int count = 0;
		int rev = 0;
		int sum = 0;
		
		while(num != 0){
			int temp = num % 10;
			count++;
			rev = rev * 10 + temp;
			sum += temp;
			num = num / 10;
		}
		
		System.out.println(count);
		System.out.println(rev);
		System.out.println(sum);
	}
}