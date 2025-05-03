class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int left1=0;
        int right1=nums1.length-1;
        int left2=0;
        int right2=nums2.length-1;

        int arr1[]=sorting(nums1);
        int arr2[]=sorting(nums2);

        ArrayList<Integer> list=new ArrayList<>();
        while(right1>=left1 && right2>=left2){
            if(arr1[left1]==arr2[left2]){
                list.add(arr1[left1]);
                left1++;
                left2++;
            }else if(arr1[left1]>arr2[left2]){
                left2++;
            }else{
                left1++;
            }
        }
        int res[]=new int [list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    public static int[] sorting(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[min]>nums[j]){
                    min=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
        return nums;
    }

}

