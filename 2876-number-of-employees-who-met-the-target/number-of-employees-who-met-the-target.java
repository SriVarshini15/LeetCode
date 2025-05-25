class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int sum=0;
        for(int ele:hours){
            if(ele>=target){
                sum+=1;
            }
        }
        return sum;
    }
}