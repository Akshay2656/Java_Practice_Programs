public class PasswordStrengthChecker {
	public static void main(String[] args) {
		String password = "Abcd1524";
		
		char[] ch = password.toCharArray();
		
		boolean isDigit = false;
		boolean isUpperCase = false;
		boolean isLowerCase = false;
		
		for (char c : ch) {
			if(Character.isDigit(c)) {
				isDigit = true;
			}
			
			if(Character.isUpperCase(c)) {
				isUpperCase = true;
			}
			
			if (Character.isLowerCase(c)){
				isLowerCase = true;
			}
		}
		
		if (isDigit && isUpperCase && isLowerCase && password.length() >= 8) {
			System.out.println("Strong Password");
		}
		else {
			System.out.println("Weak password");
		}
	}
}
