/* class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> result=new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        if(strs.length==1){
            ArrayList<String> temp=new ArrayList<>();
            temp.add(strs[0]);
            result.add(temp);
            return result;
        }
        for(int i=0;i<strs.length;i++){
            if (used[i]) continue;
            ArrayList<String> temp=new ArrayList<>();
            temp.add(strs[i]);
            used[i]=true;
            String cur=sorting(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                
                if(!used[j] && cur.equals(sorting(strs[j]))){
                    temp.add(strs[j]);
                    used[j]=true;
                }
            }
            result.add(temp);
        }
        return result;
    }
    public static String sorting(String str){
        char []arr=str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
} */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String cur=sorting(strs[i]);

            if(!map.containsKey(cur)){
                map.put(cur,new ArrayList<>());
            }
            map.get(cur).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
    public static String sorting(String str){
        char []arr=str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}