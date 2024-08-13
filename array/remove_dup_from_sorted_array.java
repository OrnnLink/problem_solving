
class Solution {
    public int removeDuplicates(int[] nums) {
		int slow = 0, fast = 1; 
		while (fast < nums.length) {
			int x = nums[slow], y = nums[fast];
			if (x != y) {
				slow++;
				nums[slow] = nums[fast]; 
			}
			fast++;
		}
	 	return slow + 1;
    }
	
	/*
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 1, 1, 2};
		int k = s.removeDuplicates(nums);
		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	*/
}
