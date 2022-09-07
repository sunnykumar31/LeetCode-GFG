class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int freq[]=new int[k+1];
        freq[0]=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int index=((sum%k)+k)%k;
            freq[index]++;
        }
        int count=0;
        for(int i=0;i<k+1;i++){
            if(freq[i]>1){
                count=count+(freq[i]*(freq[i]-1))/2;
            }
        }
        return count;
        
    }
}