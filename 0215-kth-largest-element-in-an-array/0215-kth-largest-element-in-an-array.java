class Solution {
    public int findKthLargest(int[] nums, int k) {
        //nlon(n)
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        // for(int i=0;i<nums.length;i++){
        //     pq.add(nums[i]);
        // }
        // while(k-->1){
        //     pq.poll();
        // }
        // return pq.peek();
        
        // nlog(k)
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        while(i<k){
            pq.add(nums[i]);
            i++;
        }
        for(;i<nums.length;i++){
            if(nums[i]>pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}