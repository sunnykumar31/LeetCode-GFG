class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        Arrays.sort(p);
        Arrays.sort(t);
        int lp=p.length;
        int lt=t.length;
        int j=lt-1;
        int count=0;
        for(int i=lp-1;i>=0;i--){
            while(j>=0){
                if(p[i]<=t[j]){
                    count++;
                    j--;
                }
                break;
            }
        }
        return count;
    }
}