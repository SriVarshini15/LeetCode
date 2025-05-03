class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result=new HashSet<>();
        Set<Integer> set=new HashSet<>();
        for(int ele:nums1){
            set.add(ele);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        int arr[]=new int[result.size()];
        int i=0;
        for(int ele:result){
            arr[i++]=ele;
        }
        return arr;
    }
}