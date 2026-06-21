class EmailCheck{
	public static void main(String[] args){
		String email = "example@gmail.com";
		
		if (email.contains("@") 
			&& email.indexOf("@") != 0 
			&& email.indexOf("@") == email.lastIndexOf("@")
			&& email.contains(".com"))
		{
			System.out.println("Valid Email");
		}else{
			System.out.println("Invalid Email");
		}
	}
}