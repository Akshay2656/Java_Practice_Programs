class MoveAllZeroToEnd{
	public static void main(String[] args){
		int[] arr = {3,0,34,54,0,23,0,6};
		
		int last = 0;
		
		for(int i = 0; i < arr.length; i++){
			if (arr[i] != 0){
				int temp = arr[i];
				arr[i] = arr[last];
				arr[last] = temp;
				
				last++;
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]+" ");
		}
	}
}