class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        l=len(haystack)-len(needle)+1
        for i in range(0,l):
            for j in range(len(needle)):
                if(haystack[i+j]!=needle[j]):
                    break 
                if(haystack[i+j]==needle[j] and j==len(needle)-1):
                    return i
        return -1
                
        