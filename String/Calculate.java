class Calculate{
	public void add(int... a){
		int sum = 0;
		for(int i : a){
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args){
	
		Calculate calculate = new Calculate();
		calculate.add(1,2);
		calculate.add(1,2,3);
		calculate.add(1,2,3,4);
	}
}