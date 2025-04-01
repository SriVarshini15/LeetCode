class Solution {
    public boolean judgeCircle(String moves) {
       int up=0,down=0,r=0,l=0;
       for(int i=0;i<moves.length();i++) {
        char move=moves.charAt(i);
        if(move=='U'){
            up++;
        }
        if(move=='D'){
            down++;
        }
        if(move=='R'){
            r++;
        }
        if(move=='L'){
            l++;
        }
       }
       if(up!=down || r!=l){
         return false;
       }
       return true;
    }
}