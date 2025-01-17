class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray(); 
        int i = 0;

        while (i < chars.length && chars[i] != ch) {
            i++;
        }

        if (i == chars.length) {
            return word;
        }

        int j = 0;
        while (j < i) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i--;
            j++;
        }

        return new String(chars);
    }
}
