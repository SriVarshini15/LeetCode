class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        list=[]
        for i in range(len(nums)):
            count=0
            for j in range(len(nums)):
                if(nums[i]!=nums[j] and nums[i]>nums[j]):
                    count+=1
            list.append(count)
        return list