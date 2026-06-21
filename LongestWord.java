class LongestWord{
	public static void main(String[] args){
		String str = "Java Supports Microservices";
		
		String[] word = str.split(" ");
		String longest = "";
		
		for(int i = 0; i < word.length; i++){
			if(word[i].length() > longest.length()){
				longest = word[i];
			}
		}
		System.out.println(longest);
	}
}