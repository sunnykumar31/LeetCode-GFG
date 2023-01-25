class Solution {
    public int singleNumber(int[] nums) {
        // #HashMap Method
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hp.containsKey(nums[i])) hp.put(nums[i],1);
            else hp.put(nums[i],hp.get(nums[i])+1);
        }
        for(int i=0;i<nums.length;i++){
            if(hp.get(nums[i])==1) return nums[i]; 
        }
        return 0;
        // int bit[]=new int[32];
        // for(int i=0;i<nums.length;i++){
        //     int temp=nums[i];
        //     int pos=0;
        //     while(temp!=0){
        //         if((temp&1)==1){
        //             bit[pos]++;
        //         }
        //         temp=temp>>1;
        //         pos++;
        //     }
        // }
        // int ans=0;
        // for(int i=0;i<32;i++){
        //     bit[i]%=3;
        //     if(bit[i]!=0){
        //         ans=ans+bit[i]*(int)(Math.pow(2,i));
        //     }
        // }
        // return ans;
        
    }
}