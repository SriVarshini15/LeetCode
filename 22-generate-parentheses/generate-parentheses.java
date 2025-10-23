/* class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        dfs(0, 0, "", n, res);

        return res;        
    }

    private void dfs(int openP, int closeP, String s, int n, List<String> res) {
        if (openP == closeP && openP + closeP == n * 2) {
            res.add(s);
            return;
        }

        if (openP < n) {
            dfs(openP + 1, closeP, s + "(", n, res);
        }

        if (closeP < openP) {
            dfs(openP, closeP + 1, s + ")", n, res);
        }
    }    
} */

class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result=new ArrayList<>();
        generate(0,0,"",n,result);
        return result;
    }
    public static void generate(int o,int c, String s,int n, ArrayList<String> res){
        if(o==c && o+c==n*2){
            res.add(s);
            return;
        }
        if(o<n){
            generate(o+1,c,s+"(",n,res);
        }
        if(c<o){
            generate(o,c+1,s+")",n,res);
        }
    }
}