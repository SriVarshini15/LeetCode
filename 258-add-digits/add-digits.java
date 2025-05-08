class Solution {
    public int addDigits(int num) {
        while(num>9){
            num=compute(num);
        }
        return num;
    }
    public static int compute(int num){
        int temp=0;
        while(num>0){
            int rem=num%10;
            temp+=rem;
            num/=10;
        }
        return temp;
    }
}