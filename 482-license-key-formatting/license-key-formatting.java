class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String result="";
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(count==k && s.charAt(i)!='-'){
                result="-"+result;
                count=0;
            }
            if(s.charAt(i)!='-'){
                if(!Character.isLowerCase(s.charAt(i))){
                    result=s.charAt(i)+result;
                }else{
                    int ch=s.charAt(i)-'a'+'A';
                    result=(char)ch+result;
                }
                count++;
            }

        }
        return result;
    }
}