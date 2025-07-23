class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        list=[]
        mid=len(nums)/2
        for i in range(mid):
            list.append(nums[i])
            list.append(nums[mid+i])
        return list