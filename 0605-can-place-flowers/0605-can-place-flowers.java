class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
       if(f.length==1){
           if(f[0]==0 && n==1) return true;
           else if(f[0]==1 && n==0) return true;
           else if(f[0]==0 && n==0) return true;
           else return false;
       } 
        int count=0;
        if(f[0]==0 && f[1]==0){
            count++;
            f[0]=1;
        }
        for(int i=1;i<f.length-2;i++){
            if(f[i]==0 && f[i+1]==0 && f[i+2]==0){
                count++;
                f[++i]=1;
            }
        }
        if(f[f.length-1]==0 && f[f.length-2]==0) count++;
        if(count>=n){
            return true;
        }
        return false;
    }
}