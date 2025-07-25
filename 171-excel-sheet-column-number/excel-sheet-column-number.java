/* class Solution {
    public int titleToNumber(String columnTitle) {
        int prod=0;
        if(columnTitle.length()==1){
            return columnTitle.charAt(0)-'A'+1;
        }
        for(int i=0;i<columnTitle.length()-1;i++){
            int temp=columnTitle.charAt(i)-'A'+1;
            prod=prod*26 +temp;
        }
       // prod+=columnTitle.charAt(columnTitle.length()-1)-'A'+1;
        //System.out.println(prod);
        return prod;
    }
 */

 class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}
