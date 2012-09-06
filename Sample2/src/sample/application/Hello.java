package sample.application;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello world");
		int i = 1;
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		show(s1);
		
		if(s1 == s2){
			System.out.println("s1とs2は同じ");
		}else{
			System.out.println("s1とs2は違う");
		}
		if(s1 == s3){
			System.out.println("s1とs3は同じ");
		}else{
			System.out.println("s1とs3は違う");
		}
	}
	
	public static void show(String a){
		System.out.println(a);
	}
}
