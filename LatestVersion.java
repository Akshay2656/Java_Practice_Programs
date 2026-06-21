class LatestVersion{
	public static void main(String[] args){
		String version1 = "12.1.10";
		String version2 = "12.1.12";
	
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
	
		for(int i = 0; i < v1.length; i++){
			int num1 = Integer.parseInt(v1[i]);
			int num2 = Integer.parseInt(v2[i]);
		
			if(num1 > num2){
				System.out.println("LatestVersion: "+version1);
				return;
			}else{
				System.out.println("LatestVersion: "+version2);
				return;
			}	
		}
		System.out.println("Both are Equal");
	}
}