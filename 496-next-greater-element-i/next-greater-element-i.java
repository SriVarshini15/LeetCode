class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] =new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=-1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                if(map.containsKey(stack.peek())){
                    result[map.get(stack.pop())]=nums2[i];
                }else{
                    stack.pop();
                }
            }
            if(map.containsKey(nums2[i])){
                stack.push(nums2[i]);
            }   
        }
        return result;
    }
}