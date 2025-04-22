class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        listLen=len(strs)
        fWord=strs[0]
        min=len(fWord);
        for i in range(1,listLen):
            curWord=strs[i]
            j=0
            while(len(curWord)>j and min>j and curWord[j]==fWord[j] ):
                j+=1
            if(j<min):
                min=j
            if min==0:
                break
        
        return fWord[:min]
        