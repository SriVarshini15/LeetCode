class Solution(object):
    def findRelativeRanks(self, score):
        """
        :type score: List[int]
        :rtype: List[str]
        """
        original = score[:]      
        for i in range(len(score)):
            max_ind=i
            for j in range(i+1,len(score)):
                if(score[max_ind]<score[j]):
                    max_ind=j
            score[max_ind],score[i]=score[i],score[max_ind]


        result_map={}

        for i,j in enumerate(score):
            if(i==0):
                result_map[j]="Gold Medal"
            elif(i==1):
                result_map[j]="Silver Medal"
            elif(i==2):
                result_map[j]="Bronze Medal"
            else:
                result_map[j]=str(i+1)
        
        return [result_map[s] for s in original]


        

