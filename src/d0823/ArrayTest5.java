package d0823;

public class ArrayTest5 {

	public static void main(String[] args) {
		int[][] nums = new int[2][2];
		nums[0][0] = 1;
		nums[0][1] = 2;
		
		nums[1][0] = 3;
		nums[1][1] = 4;

		int n= 1;
		for(int j=0;j<2;j++) {
			for(int i=0;i<2;i++) {
				nums[j][i] = n++;
			}
		}
	}
}
