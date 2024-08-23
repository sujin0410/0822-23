package d0823;

public class ArrayTest {
	
	public static void printNums(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	public static void main(String[] args) {
		int[] nums = new int[3];
		System.out.println(nums[0]);
		for(int i=0;i<3;i++) {
			nums[i] = i+1;
		}
		
		
	}
}
