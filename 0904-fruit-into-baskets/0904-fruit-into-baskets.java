class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length==1) return 1;
        int bskt1=fruits[0];
        int bskt2=fruits[1];
        int left=0;
        int rgt=2;
        int max=Integer.MIN_VALUE;
        while(rgt<fruits.length){
            if(fruits[rgt]!=bskt1 && fruits[rgt]!=bskt2){
                max=Math.max(max,rgt-left);
                if(fruits[rgt-1]==bskt1){
                    left=Srink_window(rgt,fruits,bskt1);
                    bskt2=fruits[rgt];
                }
                else{
                    left=Srink_window(rgt,fruits,bskt2);
                    bskt1=fruits[rgt];
                }
            }
            rgt++;
        }
        return Math.max(max,rgt-left);
    }
    public static int Srink_window(int rgt,int[] fruits,int bskt){
        int srink=rgt-1;
        while(srink>=0){
            if(fruits[srink]!=bskt){
                break;
            }
            srink--;
        }
        return srink+1;

    }
}