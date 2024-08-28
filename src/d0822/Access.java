package d0822;

public class Access {
	public int i =1; // public 다른 영역에서도 사용 가능
	
	private int i2 =1; //private 다른 영역에서는 사용 불가
	
	public int i3 =1; //다른 영역에서도 사용 가능
	//접근 제어자는 무조건 class안에 또는 앞에 있어야 한다.
	
	public static void main(String[] args) {
		//1번 예시
		//Access a = new Access();
		//System.out.println(a.i);
		//System.out.println(a.i2);
		
		//Access a1 = new Access();
		//System.out.println(a1.i);
		//System.out.println(a1.i2);
		
		//2번 예시
		Access a = new Access();
		
		Access a1 =a;
		
		a.i = 2;
		System.out.println(a1.i);
		
		
	}
}
