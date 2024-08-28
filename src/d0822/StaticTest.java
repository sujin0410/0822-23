package d0822;

public class StaticTest { //class안에 있는 데이터를 사용하려면 메모리를 생성해야한다.
	static int age = 10;
	String name = "홍길동";
	final int EXAM_TEST = 10; //상수는 전체 대문자로 쓴다.
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.age = 20;
		
		StaticTest st2 = new StaticTest();
		System.out.println(st2.age);
			//System: Java의 java.lang 패키지에 속한 클래스입니다.
			//out: System 클래스의 static 객체로, PrintStream의 인스턴스입니다.
			//println: PrintStream 클래스의 메서드로, 콘솔에 출력을 수행합니다
	}
}
