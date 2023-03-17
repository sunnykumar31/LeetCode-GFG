class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair> q=new LinkedList<>();
        HashMap<Integer,Integer> visited=new HashMap<>();
        for(int src=0;src<graph.length;src++){
            if(visited.containsKey(src)){
                continue;
            }
            BipartitePair bp=new BipartitePair(src,0);
            q.add(bp);
            while(!q.isEmpty()){
                BipartitePair rv=q.remove();
                if(visited.containsKey(rv.vtx)){
                    if(visited.get(rv.vtx)!=rv.level) return false;
                    continue;
                }
                visited.put(rv.vtx,rv.level);
                for(int nbrs:graph[rv.vtx]){
                    if(!visited.containsKey(nbrs)){
                        bp=new BipartitePair(nbrs,rv.level+1);
                        q.add(bp);
                    }
                }
            }
        }
        return true;
    }
    class BipartitePair{
        int vtx;
        int level;
        public BipartitePair(int val,int level){
            this.vtx=val;
            this.level=level;
        }
    }
}