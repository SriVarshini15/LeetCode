class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int nums:chalk){
            sum+=nums;
        }
        k%=sum;
        for(int i=0;i<chalk.length;i++){
            if(chalk[i]>k){
                return i;
            }else{
                k-=chalk[i];
            }
        }
        return -1;
    }
}
/* 
TIME LIMIT EXCEEDS:
public int chalkReplacer(int[] chalk, int k) {
        int student=0;
        int n=chalk.length;
        while(k>=chalk[student%n]){    
            k=k-chalk[student%n];
            student++;
        }
        return student%n;
    }
 */