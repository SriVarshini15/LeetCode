/* class Solution {
    public int maxArea(int[] height) {
        int maxArea=Integer.MIN_VALUE;
        int maxheight=height[0];
        int maxwidth=0;
        for(int i=0;i<height.length;i++){
            for(int j=height.length-1;j>i;j--){
                int w=j-i;
                int h=Math.min(height[i],height[j]);
                if(maxArea<h*w){
                    maxArea=h*w;
                }
            }
        }
        return maxArea;
    }
} */

class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int area=Integer.MIN_VALUE;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            area=Math.max(area,h*w);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return area;
    }
}