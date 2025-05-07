import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        if(numRows==0){
            return result;
        }

        List<Integer> temp= new ArrayList<>();
        temp.add(1);
        result.add(temp);
        for(int i=1;i<numRows;i++){
            List<Integer> tempu= new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    tempu.add(1);
                }else{
                    tempu.add((result.get(i-1).get(j))+(result.get(i-1).get(j-1)));
                }
            }
            result.add(tempu);
        }
        return result;
    }
}