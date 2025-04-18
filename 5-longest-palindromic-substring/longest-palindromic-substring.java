class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        StringBuilder t = new StringBuilder();
        t.append("#");
        for (int i = 0; i < s.length(); i++) {
            t.append("#").append(s.charAt(i));
        }
        t.append("#$");

        char[] transformed = t.toString().toCharArray();
        int[] p = new int[transformed.length];
        int center = 0, right = 0;
        int maxLen = 0, centerIndex = 0;

        for (int i = 1; i < transformed.length - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            while (transformed[i + (p[i] + 1)] == transformed[i - (p[i] + 1)]) {
                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}
