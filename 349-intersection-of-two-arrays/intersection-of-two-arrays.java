class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    res.add(nums1[i]);
                }
            }
        }
        int[] result = new int[res.size()];
        int idx = 0;
        for (int num : res) {
            result[idx++] = num;
        }
        return result;
    }
}