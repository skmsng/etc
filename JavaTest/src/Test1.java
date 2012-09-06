/*
 * Stringインスタンスについて
 */
public class Test1 {

	public static void main(String[] args) {
		
		String s1 = "String";
		String s2 = "String";
		String s3 = new String("String");
		
		if(s1==s2){
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
		
		if(s1==s3){
			System.out.println("s1 == s3");
		}else{
			System.out.println("s1 != s3");
		}

	}

}
