package sample.application;

public class Fourth {
	private String name;
	private static String name2;

	public Fourth(String name) {
		this.name = name;
		name2 = name;
	}
	

	public void showName(){
		System.out.println(this.name);
	}
	public void showName2(){
		System.out.println(name2);
	}
/*	
	public String toString() {
		return this.name;
	}
*/

	public static void main(String[] args){
		Fourth fourth = new Fourth(new String("hoge"));
		fourth.showName(); //hoge
		fourth.showName2();//hoge
		
		System.out.println();
		
		Fourth fifth = new Fourth(new String("でじはり"));
		fifth.showName(); //でじはり
		fifth.showName2();//でじはり
		
		System.out.println();
		
		fourth.showName(); //hoge
		fourth.showName2();//でじはり
		
		System.out.println(fourth.toString());
		System.out.println(new Hello().toString());
		System.out.println(new Hello());
		
	}

}
