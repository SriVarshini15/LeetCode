class Solution {
    public String largestNumber(int[] nums) {
        String result="";

        for(int i=0;i<nums.length-1;i++){
            int temp=i;
            for(int j=i+1;j<nums.length;j++){
                temp=check(temp,j,nums);
            }
            result+=Integer.toString(nums[temp]);
            int t=nums[temp];
            nums[temp]=nums[i];
            nums[i]=t;
            
        }
        result+=nums[nums.length-1];
        
        if (result.charAt(0) == '0') return "0"; 
        return result;
    }
    public static int check(int nn1,int nn2,int nums[]){
        int n1 = nums[nn1];
        int n2 = nums[nn2];
        String s1 = n1 + "" + n2;
        String s2 = n2 + "" + n1;
        if (s1.compareTo(s2) >= 0) return nn1;
        else return nn2;
    }

}