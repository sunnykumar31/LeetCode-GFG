class Solution {
     class pair implements Comparable<pair>{
        int cap;
        int pro;
        public pair(int cap,int pro){
            this.cap=cap;
            this.pro=pro;
        }
        // @overide
        public int compareTo(pair o){
            return this.cap-o.cap;
        }
        
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        pair projects[]=new pair[profits.length];
        for(int i=0;i<profits.length;i++){
            projects[i]=new pair(capital[i],profits[i]);
        }
        Arrays.sort(projects);
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
         int j=0;
        for(int i=0;i<k;i++){
           
            while(j<capital.length && projects[j].cap<=w ){
                pq.add(projects[j].pro);
                j++;
            }
            if(!pq.isEmpty()){
                w+=pq.poll();
            }
        }
        return w;
    }
}