class CountObject{
	
	static int count;
	
	CountObject(){
		count++;
	}
	
	public static void main(String[] args){
		CountObject e1 = new CountObject();
		CountObject e2 = new CountObject();
		CountObject e3 = new CountObject();
		
		System.out.println(count);
	}
}
