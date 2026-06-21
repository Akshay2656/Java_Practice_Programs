class ApiTokenValidator{
	public static void main(String[] args){
		String token = "ABC-12344-PQR";
		
		boolean pattern = token.matches("[A-Z]{3}-\\d{4}-[A-Z]{3}");
		
		if(pattern){
			System.out.println("Valid");
		}else{
			System.out.println("Not Valid");
		}
		
		
	}
}