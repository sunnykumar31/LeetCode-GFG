class Solution {
    public int longestCycle(int[] edges) {
        int in[]=new int[edges.length];
        for(int i=0;i<edges.length;i++){
            if(edges[i]!=-1){
                in[edges[i]]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i]==0) q.add(i);
        }
        boolean visited[]=new boolean[edges.length];
        while(!q.isEmpty()){
            int rv=q.remove();
            visited[rv]=true;
            int nbrs=edges[rv];
            if(nbrs!=-1){
                in[nbrs]--;
                if(in[nbrs]==0) q.add(nbrs);
            }
        }
        int ans=-1;
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                int count=1;
                int nbrs=edges[i];
                visited[i]=true;
                while(nbrs!=i){
                    visited[nbrs]=true;
                    count++;
                    nbrs=edges[nbrs];
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}
