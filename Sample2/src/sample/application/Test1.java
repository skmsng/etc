package sample.application;

/**
 * 「public」と「private」の違いについて
 */

public class Test1 {
/*
	public int i;
	private int ii;
//	public static Test1 test = new Test1();
	
	public void setPrice(int i){
		this.i = i;
		this.ii = i;
	}
	public int getValue(){
		return ii;
	}
*/	
	public static void main(String[] args) {
		/*
		String s1 = "１２３";
		System.out.println(s1);
		
		int i1 = Integer.parseInt(s1);
		System.out.println(i1);
		
		//int i2 = Integer.valueOf(s1).intValue();
		int i2 = Integer.valueOf(s1);
		System.out.println(i2);
		*/
		
		//Test1 test = new Test1(); //同一クラスの場合
		Test2 test = new Test2(); //別クラスの場合
		test.setPrice(1);
		System.out.println(test.i);
//		System.out.println(test.ii); //mainメソッドと同一クラスのフィールドに定義するとprivateでも呼べてしまう
		System.out.println(test.getValue());
		
		test.i = 2;
//		test.ii = 2; //mainメソッドと同一クラスのフィールドに定義するとprivateでも代入できてしまう
		test.setPrice(2);
		
		System.out.println(test.i);
//		System.out.println(test.ii); //mainメソッドと同一クラスのフィールドに定義するとprivateでも呼べてしまう
		System.out.println(test.getValue());
		
	}
	

}
