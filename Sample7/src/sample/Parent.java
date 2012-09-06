package sample;

public class Parent implements Human{
	
	public String name_;
	
	
	public Parent(String name){
		this.name_ = name;
	}
	
	@Override
	public String getName(){
		return this.name_;
	}
	
	public static void showType(){
		System.out.println("Parent");
	}
	
}
