class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int pre=pq.poll();
        int count=1;
        int max=Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            int post=pq.poll();
            if(post-pre==1){
                count++;
            }
            else if(pre==post){}
            else{
                max=Math.max(max,count);
                count=1;
            }
            pre=post;
        }
        return Math.max(max,count);
    }
}