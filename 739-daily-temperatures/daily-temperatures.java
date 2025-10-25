/* class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length-1;i++){
            int count=1;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[i]<temperatures[j]){
                    result[i]=count;
                    break;
                }
                count++;
            }
        }
        return result;
    }
} */

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); 

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }
}