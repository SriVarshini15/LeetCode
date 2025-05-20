class Solution {
    public List<String> cellsInRange(String s) {
        List<String> list=new ArrayList<>();
        for(char i=s.charAt(0);i<=s.charAt(3);i++){
            for(char j=s.charAt(1);j<=s.charAt(4);j++){
                list.add(i+""+j);
            }
        }
        return list;
        
    }
}