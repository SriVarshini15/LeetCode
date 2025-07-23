class Solution(object):
    def frequencySort(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        freq_map = {}
        for i in range(len(nums)):
            count = 0
            for j in range(len(nums)):
                if nums[i] == nums[j]:
                    count += 1
            freq_map[nums[i]] = count

        # Sort by frequency ascending, value descending
        sorted_items = sorted(freq_map.items(), key=lambda item: (item[1], -item[0]))

        result = []
        for key, freq in sorted_items:
            for _ in range(freq):
                result.append(key)

        return result
