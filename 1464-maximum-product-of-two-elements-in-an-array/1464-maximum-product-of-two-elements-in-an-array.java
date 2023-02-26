class Solution {
    public int maxProduct(int[] nums) {
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        // for(int i=0;i<nums.length;i++){
        //     pq.add(nums[i]);
        // }
        // return (pq.remove()-1)*(pq.remove()-1);
        
        int max1=0;
        int max2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
                
            }
            else if(nums[i]>max2){
                max2=nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}