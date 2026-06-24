import java.util.Scanner;

public class TwoSumProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Sum of two number");
		int target = sc.nextInt();
		
		for (int i =0; i < arr1.length; i++) {
			for(int j = i+1; j< arr1.length; j++) {
				if(arr1[i] + arr1[j] == target) {
					System.out.println("Sum of the "+arr1[i]+" and "+arr1[j]);
					break;
				}
			}
		}
	}
}
