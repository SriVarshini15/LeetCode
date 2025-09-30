class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1; 
        for (int i = n - 1; i >= 0; i--) {
            while (m > 0 && nums1[m - 1] > nums2[i]) {
                nums1[k--] = nums1[--m];
            }
            nums1[k--] = nums2[i];
        }
    }
}