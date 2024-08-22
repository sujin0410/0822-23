package d0822;

public class StaticTest {
	static int age = 10;
	String name = "홍길동";
	
	public static void main(String[] arg1s) {
		StaticTest st = new StaticTest();
		StaticTest.age = 20;
		
		StaticTest st2 = new StaticTest();
		System.out.println(st2.age);
	}
}
