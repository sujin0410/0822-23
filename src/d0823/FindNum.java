package d0823;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(100)+1;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("생각하는 숫자를 적어 보아요 : ");
			String num = s.nextLine();
			System.out.println("랜덤 숫자는 : " + rNum);
			System.out.println("당신이 생각하는 숫자는 : " + num);
			
			int n = Integer.parseInt(num);
			if(rNum==n) {
				System.out.println("얼~~ 맞췄네요~");
				break;
			}else {
				System.out.println("틀렸네~!!");
			}
		}
	}
}
