package sample;

public class Main {
	
	public static void main(String[] args){
		
		System.out.println("Hello");
		
		Parent takeda = new Parent("武田さん");
		Parent wada = new Parent("和田さん");
		
		Child gondo = new Child("権藤さん");
		Main.showName(gondo);
//		System.out.println(gondo.getChildName());
		
		Main.showName(takeda);
		Main.showName(wada);
		
		System.out.println(wada.getName());
		System.out.println(takeda.getName());
		System.out.println(wada.getName());
		System.out.println(takeda.getName());
		System.out.println(wada.getName());
		
//		Parent.showType();
//		Child.showType();
	}
	
	public static void showName(Human parent){
		System.out.println(parent.getName());
//		parent.showType();
	}
	
}
