class Solution:
    def removeDuplicates(self, nums) -> int:
        sorted_nums = []
        for n in nums:
            if n not in sorted_nums:
                sorted_nums.append(n)
        for i in range(len(sorted_nums)):
            nums[i] = sorted_nums[i]
        return len(sorted_nums)

"""
s = Solution()
nums = [0,0,1,1,1,2,2,3,3,4]
nums = [-1,0,0,0,0,3,3]
k = s.removeDuplicates(nums)

for i in range(k):
    n = nums[i]
    print(n, end =" ")
print()
"""

