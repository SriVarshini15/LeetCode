class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int sum=0;
        for(int ele:hours){
            sum=(ele>=target) ? sum+1:sum;
        }
        return sum;
    }
}