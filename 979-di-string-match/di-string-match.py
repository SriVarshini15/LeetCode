class Solution(object):
    def diStringMatch(self, s):
        """
        :type s: str
        :rtype: List[int]
        """
        list=[]
        i,j=0,len(s)
        for k in range(len(s)):
            if(s[k]=='I'):
                list.append(i)
                i+=1
            else:
                list.append(j)
                j-=1
        list.append(j)
        return list

        