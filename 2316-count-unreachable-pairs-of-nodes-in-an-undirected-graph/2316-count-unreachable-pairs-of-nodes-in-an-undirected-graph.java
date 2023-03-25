class Solution {
    public long countPairs(int n, int[][] edges) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        // System.out.println(map);
        return ByBFS(map,n);
    }
    public long ByBFS(HashMap<Integer,ArrayList<Integer>> map,int n){
        Queue<Integer> q=new LinkedList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        HashSet<Integer> visited=new HashSet<>();
        int comp=0;
        for(int i=0;i<n;i++){
            if(visited.contains(i)){
                continue;
            }
            comp++;
            q.add(i);
            int count=0;
            while(!q.isEmpty()){
                int rv=q.remove();
                if(visited.contains(rv)){
                    continue;
                }
                count++;
                visited.add(rv);
                for(int nbrs:map.get(rv)){
                    if(!visited.contains(nbrs)) q.add(nbrs);
                }
            }
            pq.add(count);
        }
        // System.out.println(comp);
        if(comp==1){
            return 0;
        }
        long ans=0;
        while(!pq.isEmpty()){
            int rv=pq.remove();
            // System.out.println(rv);
            n=n-rv;
            ans+=(long)rv*(n);
            
        }
        return ans;
    }
}