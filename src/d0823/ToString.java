package d0823;

class Father{
	public String test() {
		return "아빠다";
	}
}
public class ToString extends Father{
	
	public String test() {
		return "난 투스트링이야!!";
	}
	
	public String toString() {
		return "메모리 주소가 나올줄 알았지?";
	}
	
	public static void main(String[] args) {
		ToString ts = new ToString();
		System.out.println(ts);
	
	}

}
