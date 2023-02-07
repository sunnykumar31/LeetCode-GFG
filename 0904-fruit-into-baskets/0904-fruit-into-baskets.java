class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length==1) return 1;
        int bskt1=fruits[0];
        int bskt2=fruits[1];
        int lft=0;
        int rgt=2;
        int max=Integer.MIN_VALUE;
        while(rgt<fruits.length){
            if(fruits[rgt]!=bskt1 && fruits[rgt]!=bskt2){
                max=Math.max(max,rgt-lft);
                if(fruits[rgt-1]==bskt1){
                    int srink=rgt-1;
                    while(srink>=0){
                        if(fruits[srink]!=bskt1){
                            break;
                        }
                        srink--;
                    }
                    lft=srink+1;
                    bskt2=fruits[rgt];
                }
                else{
                    int srink=rgt-1;
                    while(srink>=0){
                        if(fruits[srink]!=bskt2){
                            break;
                        }
                        srink--;
                    }
                    lft=srink+1;
                    bskt1=fruits[rgt];
                }
            }
            rgt++;
        }
        return Math.max(max,rgt-lft);
    }
}