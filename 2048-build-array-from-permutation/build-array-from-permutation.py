class Solution(object):
    def buildArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        list=[]
        for i in range(0,len(nums)):
            list.append(nums[nums[i]])
        return list
        