class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int arr[]=new int[n+1];
        int iCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=iCount++;
            }else{
                arr[i]=n--;
            }
        }
        arr[s.length()]=iCount;
        return arr;
    }
}