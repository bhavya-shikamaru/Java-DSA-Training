class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
        boolean yes = true;
        for(int i:bills){
            if(i==5){
               f++;
            }
            else if(i==10){
                if(f>0){
                    f--;
                    t++;
                }
                else yes = false;

            }
            else{
                if(f>0&&t>0){
                    f--;
                    t--;
                }
                else if(f>2){
                    f=f-3;
                }
                else yes = false;
            }
        }
        return yes;
        
    }
}