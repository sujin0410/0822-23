package d0822;

public class Condition2 {
	public static void main(String[] args) {
		String str = "1";
		
		String str1 = "1";
		
		String str2 = new String("1");
		
		System.out.println(str==str1);
		
		System.out.println(str1==str2); //str1과 str2는 false이지만 equals를 사용하여 true를 만들 수 있음 (아래 예시1)
		
		System.out.println(str1.equals(str2)); //예시1
		
		if(str.equals(str1)) {
			System.out.println("str, str1 같음");
		}else if(str1.equals(str2)) {
			System.out.println("str1, str2 같음");
		}else if(str.equals(str2)) {
			System.out.println("str, str2 같음");
		}else {
			System.out.println("false");
		}
	}
}
