import java.util.HashMap;

/*
 * オートボクシング
 * ラッパークラス
 * java1.4以前ではオートボクシングがないので、基本型（プリミティブ型）は入れることができない
 * 
 * classクラス
 * 
 * enum型
 */
public class SampleClass {

	public static void main(String[] args) {
		
/*
	    public static String s1;
	    //初期化
	    static{
	    	s1 = "test";
	    }
*/	
		
		HashMap map = new HashMap();
		int hoge = 1;
		map.put("1", new Integer(1));
		map.put("hoge", true);
		map.put("", "");
		map.put(hoge, null);
		
		
		Class c1 = String.class;
		Object o1 = c1;
		
		Class c2 = Integer.class;
		Object o2 = c2;
		
		Class c3 = Object.class;
		Object o3 = c3;
		
		if(c3 instanceof Class){
			System.out.println("c3 instanceof Class");
		}else{
			System.out.println("! c3 instanceof Class");
		}
		if(o3 instanceof Object){
			System.out.println("o3 instanceof Object");
		}else{
			System.out.println("! o3 instanceof Object");
		}
		
	}
}
enum EnumClass{
	AIUEO,
	KAKIKUKEKO,
}

