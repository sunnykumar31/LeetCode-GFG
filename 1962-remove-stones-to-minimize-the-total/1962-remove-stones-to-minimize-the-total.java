class Solution {
    public int minStoneSum(int[] piles, int k) {
        //bekar approch but let me try TLE
        // int i=piles.length-1;
        // int j=i;
        // Arrays.sort(piles);
        // for(int m=0;m<k;m++){
        //     if(piles[j]<=piles[i]){
        //         piles[i]=(piles[i]+1)/2;
        //         // Arrays.sort(piles);
        //         i=j;
        //         continue;
        //     }
        //     piles[i]=(piles[i]+1)/2;
        //     i--;
        // }
        // int sum=0;
        // for(int p=0;p<piles.length;p++){
        //     sum+=piles[p];
        // }
        // return sum;
        
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        for(int i=0;i<piles.length;i++){
            pq.add(piles[i]);
            ans+=piles[i];
        }
        for(int i=0;i<k;i++){
            int max_ele=pq.poll();
            ans-=(max_ele/2);
            pq.add((max_ele+1)/2);
        }
        return ans;

    }
}