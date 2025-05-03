class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return -1;
    }
    
}
/* 
WORKS BUT LESS EFFICIENT:
public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            if(search(nums2,nums1[i])){
                return nums1[i];
            }
        }
        return -1;
    }
    public static boolean search(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return true;
            }if(target>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
 */