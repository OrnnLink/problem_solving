import java.util.Map; 
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i]; 
			int complement = Math.abs(target - num);
			
			
			if (numMap.get(complement) != null) {
				return new int[]{ numMap.get(complement), i};
			}
			numMap.put(num, i);
		}
		return new int[2];
    }

	/*
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 5}; 
		int target = 7; 
		Solution s = new Solution();
		for (int n : s.twoSum(nums, target)) {
			System.out.println(n);
		}
	}
	*/
}

