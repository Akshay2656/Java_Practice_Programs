class MaskedNumber{
	public static void main(String[] args){
		String cardNumber = "1234567812345678";
		
		//System.out.println(cardNumber.replaceAll(cardNumber.substring(0,12),"************"));
		
		// repeat -> create stars equal to the number of digits to hide
		// extract the last 4 digits and both part are concatenated to form the masked card number
		String masked = "*".repeat(cardNumber.length() - 4) + cardNumber.substring(cardNumber.length() - 4);
		
		System.out.println(masked);
		
	}
}