class MaskedNumber{
	public static void main(String[] args){
		String cardNumber = "1234567812345678";
		
		//System.out.println(cardNumber.replaceAll(cardNumber.substring(0,12),"************"));
		
		String masked = "*".repeat(cardNumber.length() - 4) + cardNumber.substring(cardNumber.length() - 4);
		
		System.out.println(masked);
		
	}
}