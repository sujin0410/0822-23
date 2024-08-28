package d0822;

class Mother{

	public void work() {
		System.out.println("회사에 출근!!");
	}
	
	public void attack() {
		System.out.println("등짝스매싱!");
	}
}

class Son extends Mother{
	
	public void work() {
		System.out.println("학교에 등교!!");
	}
	public void play() {
		System.out.println("그놈의 롤!!");
	}
}
public class ExtendsTest{
	public static void main(String[] args) {
		Mother m = new Mother();
		m.work();
		if(m instanceof Son) {
			Son s = (Son)m;
			s.play();
		}
	}
}

