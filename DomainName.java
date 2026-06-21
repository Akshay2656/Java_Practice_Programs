class DomainName{
	public static void main(String[] args){
		
		String email = "example@gmail.com";
		
		int index = email.indexOf('@');
		System.out.println(email.substring(index + 1, email.length()));
	
	}
}