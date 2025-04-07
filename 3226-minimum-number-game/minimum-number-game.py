class Solution(object):
    def numberGame(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        l=[0]*len(nums)

        for i in range(len(nums)-1):
            min=i
            for j in range(i+1,len(nums)):
                if(nums[min]>nums[j]):
                    min=j
            temp=nums[i]
            nums[i]=nums[min]
            nums[min]=temp
        
        for i in range(1,len(nums),2):
            l[i-1]=nums[i]
            l[i]=nums[i-1]

        return l



        