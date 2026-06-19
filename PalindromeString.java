import java.util.Scanner;

public class PalindromeString {
	public static void revString(String str) {
		
		String reverse = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
	
	public static void split(String str) {
		
		String reverse = "";		
		
		String[] words = str.split(" ");
		
		for(int i = words.length - 1 ; i >=0; i--) {
			System.out.print(words[i]+" ");
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		String str = "Hello Java";
		revString(str);
		split(str);
	}
}