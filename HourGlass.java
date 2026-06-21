class HourGlass{
	public static void main(String[] args){
		int[][] arr = {
						{1,2,3,4},
						{5,6,7,8},
						{1,2,3,4},
						{5,6,7,8}};
						
		int maxSum = 0;
		
		for(int row = 0; row < arr.length - 2; row++){
			for(int col = 0; col < arr.length - 2; col++){
				int sum = 0;
				sum += arr[row][col] + arr[row][col + 1] + arr[row][col + 2];
				sum += arr[row + 1][col + 1];
				sum += arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
				
				if(maxSum < sum){
					maxSum = sum;
				}
			}
		}
		System.out.println("Maximum Sum is: "+maxSum);

	}
}