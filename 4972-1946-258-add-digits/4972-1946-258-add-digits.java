class Solution {
    public int addDigits(int num) {
        int dup=num;
        while(dup>9){
            dup=compute(dup);
        }
        return dup;
    }
    public int compute(int dup){
        int sum=0;
        while(dup>0){
            int rem=dup%10;
            sum+=rem;
            dup/=10;
        }
        return sum;
    }
}