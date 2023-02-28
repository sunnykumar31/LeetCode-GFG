class Solution {
    public int[] findArray(int[] pref) {
        for(int i=pref.length-1;i>0;i--){
            pref[i]=pref[i-1]^pref[i];
        }
        return pref;
         // [5,2,0,3,1]
         // 3^1=2  [5,2,0,3,2]
         // 0^3=3;[5,2,0,3,2]
         // 2^0=2;[5,2,2,3,2]
         // 5^2=7;[5,7,2,3,2]
    }
}