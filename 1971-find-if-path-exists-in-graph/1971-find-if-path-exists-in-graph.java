class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dst) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList());
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        return BFS(map,src,dst);
    }
    public static boolean BFS(HashMap<Integer,List<Integer>> map, int src, int dst){
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
            for(int nbrs:map.get(rv)){
                if(!visited.contains(nbrs)) q.add(nbrs);
            }
        }
        return false;
    }
}