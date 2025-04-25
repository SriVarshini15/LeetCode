class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ind=0;
        for i in range(1,len(nums)):
            if(nums[ind]!=nums[i]):
                ind+=1
                nums[ind]=nums[i]

        return ind+1
            
        