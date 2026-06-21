import java.util.Arrays;

class ExtractData{
	public static void main(String[] args){
		String url = "www.example.com?id=101&name=xyz";
		
		String[] str = url.substring(url.indexOf("?") + 1, url.length()).split("&");
		
		System.out.println(Arrays.toString(str));
	}
}