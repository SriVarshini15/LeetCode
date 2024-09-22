import java.io.*;
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for (int i=0;i<n;i++){
            int a=target-nums[i];
            for(int j=i+1;j<n;j++){
                if(a==nums[j]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        if (result[0] != -1) {
            System.out.println(result[0] + ", " + result[1]);
        }
    }
}