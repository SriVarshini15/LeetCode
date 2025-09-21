public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int max=0;
        if(matrix.length==0){return 0;}
        int n=matrix[0].length;
        int heights[]=new int[n];
        for(char []row:matrix){
            for(int i=0;i<n;i++){
                if(row[i]=='1'){
                    heights[i]+=1;
                }else{
                    heights[i]=0;
                }
            }
            max=Math.max(max,check(heights));
        }
        return max;
    }
    public static int check(int []heights){
        int maxArea=0;
        int n=heights.length;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<=n;i++){
            int h=(i==n)?0:heights[i];
            while(!stack.isEmpty() && h<heights[stack.peek()] ){
                int height=heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                maxArea=Math.max(maxArea,height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}