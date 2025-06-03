class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five+=5;
            }else if(bills[i]==10 && five>=5){
                ten+=10;
                five-=5;
            }else if(bills[i]==20 && five>=5 && (ten>=10 || five>=15)){
                if(ten>=10){
                    five-=5;
                    ten-=10;
                }else{
                    five-=15;
                }
                twenty+=20;
            }else{
                return false;
            }
        } 
        return true;       
    }
}