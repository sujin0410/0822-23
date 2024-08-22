package d0822;

public class Access {
	public int i = 1;
	int i2 = 1;

	public static void main(String[] args) {
		
		Access a = new Access();
		
		Access a1 = a;
		
		a.i = 2;
		
		System.out.println(a1.i);
		
	}
}
