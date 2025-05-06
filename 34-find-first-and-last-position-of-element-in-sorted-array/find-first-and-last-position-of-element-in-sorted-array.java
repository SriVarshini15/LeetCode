class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res=search(nums,target);
        int arr[]={-1,-1};
        if(res==-1){
            return arr;
        }
        int left=res,right=res;
        while(left>=0 && nums[left]==target){
            arr[0]=left;
            left--;
        }
        while(right<=nums.length-1 && nums[right]==target){
            arr[1]=right;
            right++;
        }
        return arr;
    }
    public static int search(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
