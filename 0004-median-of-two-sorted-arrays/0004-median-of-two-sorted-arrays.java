class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    final int n1 = nums1.length;
    final int n2 = nums2.length;
    int n3=n1+n2;
    int mid=n3/2;
    double med=0;
    int [] arr=new int[n3];
    for (int i = 0; i < n1; i++) {
            arr[i] = nums1[i];
        }
    for (int i = 0; i < n2; i++) {
        arr[n1 + i] = nums2[i];
    }
    Arrays.sort(arr);
    if(n3%2==0){
        med = (arr[mid - 1] + arr[mid]) / 2.0;
        
    }
    else{
        med=arr[mid];
    }
    return med;
    }
}