/* class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double result;
        if(nums1.length>nums2.length){
            result=findMedian(nums1,nums2);
        }else{
            result=findMedian(nums2,nums1);
        }
        return result;
    }

    public static double findMedian(int nums1[],int nums2[]){
        double median=0.0;
        int left1=0;
        int left2=0;
        int right1=nums1.length-1;
        int right2=nums2.length-1;
        int count=(right1+right2+2)/2;

        int mid=left1+(right1-left1)/2;
        left1=mid;
        right1=mid+1;
        left2=count-left1;
        right2=count-right1;

        while(left1<=right1){
            mid=left1+(right1-left1)/2;
            if(nums1[left1]<nums2[right2] && nums2[left2]<nums1[right1]){
                median =(Math.max(left1,left2)+ Math.max(right1,right2))/2;
                break;
            }if(nums1[left1]>nums2[right2]){
                left1--;
            }else{
                right2++;
            }
            if(nums2[left2]>nums1[right1]){
                left2--;
            }
            else{
                right1++;
            }
        }

        return median;
    }
} */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedian(nums2, nums1); // binary search on smaller array
        } else {
            return findMedian(nums1, nums2);
        }
    }

    public static double findMedian(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left1 = 0;
        int right1 = m;

        while (left1 <= right1) {
            int mid = (left1 + right1) / 2;
            int left2 = (m + n + 1) / 2 - mid;

            int maxLeft1 = (mid == 0) ? Integer.MIN_VALUE : nums1[mid - 1];
            int minRight1 = (mid == m) ? Integer.MAX_VALUE : nums1[mid];

            int maxLeft2 = (left2 == 0) ? Integer.MIN_VALUE : nums2[left2 - 1];
            int minRight2 = (left2 == n) ? Integer.MAX_VALUE : nums2[left2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 0) {
                    return ((double)Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
                } else {
                    return (double)Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                right1 = mid - 1;
            } else {
                left1 = mid + 1;
            }
        }

        return 0.0; // fallback return; won't happen for valid sorted input
    }
}

