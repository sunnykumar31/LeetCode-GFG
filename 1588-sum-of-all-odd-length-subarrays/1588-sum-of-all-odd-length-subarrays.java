class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int l=arr.length;
        int ans=0;
        //odd length
        for(int i=0;i<l;i++){
            ans+=(((i+1)*(l-i)+1)/2)*arr[i];
        }
        //even length;
        // for(int i=0;i<l;i++){
        //     ans+=(((i+1)*(l-i))/2)*arr[i];
        // }
        
        return ans;
        
        
    }
}