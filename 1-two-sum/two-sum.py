class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        found=False
        for i in range(0,len(nums)-1):
            temp=target-nums[i]
            for j in range(i+1,len(nums)):
                if(nums[j]==temp):
                    return [i,j]
        if(not found):
            return []
        