class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int ls=spells.length;
        int lp=potions.length;
        int ans[]=new int[ls];
        Arrays.sort(potions);
        for(int i=0;i<ls;i++){
            if(success>(long)spells[i]*potions[lp-1]){
                ans[i]=0;
                continue;
            }
            //by simple searching gives TLE
            // for(int j=0;j<lp;j++){
            //     if(success<=(long)spells[i]*potions[j]){
            //         ans[i]=lp-j;
            //         break;
            //     }
            // }
            
            //by binary search
            int j=0;
            int k=lp-1;
            while(j<=k){
                int mid=(j+k)/2;
                if(success>(long)spells[i]*potions[mid]){
                    j=mid+1;
                }
                else{
                    k=mid-1;
                }
            }
            ans[i]=lp-j;
            
        }
        return ans;
    }
}