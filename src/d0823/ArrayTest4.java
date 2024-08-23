package d0823;

import java.util.Random;

public class ArrayTest4 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] lotto = new int[7];
		for(int i=0;i<7;i++) {
			int random = r.nextInt(7) + 1;
			for(int j=0;j<i;j++) {
				if(lotto[j] == random) {
					random = -1;
					break;
				}
			}
			if(random==-1) {
				i--;
				continue;
			}
			lotto[i] = random;
		}
		
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i] + ",");
		}
	}
}
