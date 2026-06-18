public class MinMax {
	public static void main(String[] args) {
		int[] arr = {44,23,34,45,21,32};
	
		int max = arr[0];
		int sMax = arr[0];
		int min = arr[0];
		int sMin = arr[0];
		
		for(int i = 0; i < arr.length ; i++) {		
			if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            } else if (arr[i] > sMax && arr[i] != max) {
                sMax = arr[i];
            }

            if (arr[i] < min) {
                sMin = min;
                min = arr[i];
            } else if (arr[i] < sMin && arr[i] != min) {
                sMin = arr[i];
            }
		}
		
		System.out.println(sMax);
		System.out.println(max);
		System.out.println();
		System.out.println(min);
		System.out.println(sMin);
	
	}
}