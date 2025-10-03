class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result=new ArrayList<>();
        result.add(1);
        for(int i=1;i<=rowIndex;i++){
            for(int j=result.size()-1;j>0;j--){
                result.set(j,result.get(j)+result.get(j-1));
            }
            result.add(1);
        }
        return result;
        
    }
}