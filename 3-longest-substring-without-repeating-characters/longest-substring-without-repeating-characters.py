class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        visited=set()
        start=0
        end=0
        maxi=0
        while(end<len(s)):
            if(s[end] in visited):
                visited.remove(s[start])
                start+=1
            else:
                visited.add(s[end])
                end+=1
                if(maxi<len(visited)):
                    maxi=len(visited)
        return maxi
        