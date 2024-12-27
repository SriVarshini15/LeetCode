class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = Integer.MIN_VALUE;
        int temp = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] - i + temp > max) 
                max = values[i] - i + temp;
            
            if (values[i] + i > temp) 
                temp = values[i] + i;
        }

        return max;
    }
}