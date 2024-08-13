
class Solution {
    public int removeElement(int[] nums, int val) {
		/*
		if (nums.length == 0) { 
			return 0;
		} else if (nums.length == 1) { 
			return nums[0] == val ? 0 : 1;
		}
		*/
		int l = 0, r = nums.length - 1;
		int count = 0;
		while (l <= r) {
			int left = nums[l], right = nums[r];
			if (left != val) {
				l++;
			} else {
				if (right == val) {
					count++;
				} else {
					int tmp = right;
					nums[r] = left;
					nums[l] = tmp;
					l++;
				count++;
				}
				r--;
			}
		}
		System.out.println("Count: " + count);
		return nums.length - count; 
    }

	/*
def remove_element(nums, val):
    i = 0
    for j in range(len(nums)):
        if nums[j] != val:
            nums[i] = nums[j]
            i += 1
    return i
	*/
		

	public static void main(String[] args) {
		Solution s = new Solution();
		// int[] nums = {3,2,2,3};
		// int[] nums = {0,1,2,2,3,0,4,2};
		int[] nums = {2};
		int val = 2;
		int k = s.removeElement(nums, val);
		System.out.println("K: " + k);
		for (int i =0; i < k; i++) 
			System.out.println(nums[i]);
	}
	
}
