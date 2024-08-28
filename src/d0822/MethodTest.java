package d0822;

class MethodTest {  //변수의 선언 방법 () 다음 {}
	int i;
	
	static void test() {
		System.out.println("1");
	}
	
	static int test1() {
		return 1;
	}
	
	public static void main(String[] args) {
		int i = test1() +1 ;
		System.out.println(i);
		
	}
}
