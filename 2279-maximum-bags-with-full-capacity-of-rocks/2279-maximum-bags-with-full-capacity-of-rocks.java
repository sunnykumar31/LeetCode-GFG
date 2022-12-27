class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int aR) {
        int lc=capacity.length;
        int diff[]=new int[lc];
        for(int i=0;i<lc;i++){
            diff[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(diff);
        int count=0;
        for(int i=0;i<lc;i++){
            if(diff[i]==0){
                count++;
            }
            else{
                if(aR>=diff[i]){
                    aR-=diff[i];
                    count++;
                }
                else{
                    return count;
                }
            }
        }
        return count;
    }
}