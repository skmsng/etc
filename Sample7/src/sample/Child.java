package sample;

public class Child implements Human{
	
	public String name_;
	
	
	public Child(String name){
		this.name_ = name;
	}
	
	public String getName(){
		return this.name_ + "jr.";
	}
	
	public static void showType(){
		System.out.println("Child");
	}
	
}
