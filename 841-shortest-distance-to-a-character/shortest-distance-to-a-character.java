class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        int[] result1 = new int[n];
        int[] result2 = new int[n];

        int k = n;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) k = 0;
            result1[i] = k;
            k++;
        }


        k = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) k = 0;
            result2[i] = k;
            k++;
        }


        for (int i = 0; i < n; i++) {
            result[i] = Math.min(result1[i], result2[i]);
        }

        return result;
    }
}
