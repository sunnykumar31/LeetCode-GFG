class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dst) {
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap());
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            map.get(v1).put(v2,0);
            map.get(v2).put(v1,0);
        }
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int rv=q.remove();
            if(visited.contains(rv)){
                continue;
            }
            visited.add(rv);
            if(rv==dst){
                return true;
            }
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)) q.add(nbrs);
            }
        }
        return false;
    
    }
    // public static boolean BFS()
}