class Solution {
    List<List<String>> output = new ArrayList<>();
    
    public List<List<String>> partition(String str) {
        splitString(str, new ArrayList<>());
        return output;
    }

    public void splitString(String str, List<String> tempResult) {
        if (str.length() == 0 || str == null) {
            output.add(new ArrayList<>(tempResult));
            return;
        }
        
        for (int i = 1; i <= str.length(); i++) {
            String segment = str.substring(0, i);
            if (!checkPalindrome(segment)) continue;
            
            tempResult.add(segment);
            splitString(str.substring(i, str.length()), tempResult);
            tempResult.remove(tempResult.size() - 1);
        }
        return;
    }

    public boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
