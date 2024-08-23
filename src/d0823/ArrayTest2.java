package d0823;

public class ArrayTest2 {
	
	public static int[] add(int[] nums, int a) {
		int[] tmps = nums;
		nums = new int[nums.length+1];
		for(int i=0;i<tmps.length;i++) {
			nums[i] = tmps[i];
		}
		nums[nums.length - 1] = a;
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 24;
		nums[2] = 38;
		nums = add(nums,2);
		nums = add(nums,21);
		nums = add(nums,222);
		nums = add(nums,33);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
