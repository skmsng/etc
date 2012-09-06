package sample.application;

public class Parson {
	//クラス変数
	public static String uji = "氏";
	public static String na  = "名";

	//インスタンス変数
	public String firstName;
	public String lastName;

	//getter
	public String getFirstName(){
		return firstName;
	}

	//setter
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	//getter
	public String getLastName(){
		return lastName;
	}

	//setter
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	//氏：ラストネーム＿名：ファーストネーム
	public void showName(){
		System.out.println(uji + ":" + lastName + " " + na + ":" + firstName);
	}


	public static void main(String args[]){
		Parson watanabe = new Parson();
		watanabe.setFirstName("高志");
		watanabe.setLastName("渡辺");
		watanabe.showName();

		Parson wada = new Parson();
		wada.setFirstName("充史");
		wada.setLastName("和田");
		wada.showName();

		watanabe.showName();
	}
}
