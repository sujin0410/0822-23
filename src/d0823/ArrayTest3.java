package d0823;

public class ArrayTest3 {

	public static void main(String[] args) {
		/*
		 * String 배열변수를 만듭니다. 방은 4개입니다.
		 * 0번째 방에는 10
		 * 1번째 방에는 20
		 * 2번째 방에는 30
		 * 3번째 방에는 40
		 * 을 집어 넣고
		 * 모든방을 출력하시면 됩니다.
		 */
		
		String[] strs = new String[10];
		for(int i=0;i<strs.length;i++) {
			strs[i] = (i+1) + "0";
		}
		
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
}
