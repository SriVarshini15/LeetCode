class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        res=[]
        i=len(a)-1
        j=len(b)-1
        carry=0
        while(i>=0 or j>=0):
            sum=carry
            if(i>=0):
                sum=sum+int(a[i])
                i=i-1
            if(j>=0):
                sum+=int(b[j])
                j=j-1
            res.append(str(sum%2))
            carry=sum//2
        if(carry!=0):
            res.append('1')
        
        res=res[::-1]
        return ''.join(res)
        