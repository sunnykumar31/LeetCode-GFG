class Solution {
    public int minScore(int n, int[][] roads) {
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new HashMap<>());
        }
        for(int i=0;i<roads.length;i++){
            int v1=roads[i][0];
            int v2=roads[i][1];
            int cost=roads[i][2];
            map.get(v1).put(v2,cost);
            map.get(v2).put(v1,cost);
        }
        return minimum(map,n);
    }
    public int minimum(HashMap<Integer,HashMap<Integer,Integer>> map,int n){
        int min=Integer.MAX_VALUE;
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
            q.add(1);
            while(!q.isEmpty()){
                int rv=q.remove();
                if(visited.contains(rv)){
                    continue;
                }
                visited.add(rv);
                for(int nbrs:map.get(rv).keySet()){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                    min=Math.min(min,map.get(rv).get(nbrs));
                }
            }
        return min;
    }
}
