class Solution {
    public int mostFrequentEven(int[] nums) {
        int l1=nums.length;
        int max=0;
        for(int i=0;i<l1;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int freq[]=new int[max+1];
        for(int i=0;i<l1;i++){
            freq[nums[i]]++;
        }
        int count_max=0;
        int index=-1;
        for(int i=0;i<max+1;i+=2){
            if(count_max<freq[i]){
                count_max=freq[i];
                index=i;
            }
        }
        return index;
    }
}