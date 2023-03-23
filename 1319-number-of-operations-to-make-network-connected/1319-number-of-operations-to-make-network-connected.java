class Solution {
    public int makeConnected(int n, int[][] connections) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<connections.length;i++){
            int v1=connections[i][0];
            int v2=connections[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        return required(n,map);
    }
    public int required(int n,HashMap<Integer,ArrayList<Integer>> map){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        int comp=0;
        int cycle=0;
        for(int i=0;i<n;i++){
            if(visited.contains(i)){
                continue;
            }
            comp++;
            q.add(i);
            while(!q.isEmpty()){
                int rv=q.remove();
                if(visited.contains(rv)){
                    cycle++;
                    continue;
                }
                visited.add(rv);
                for(int nbrs:map.get(rv)){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        }
        if(comp-1<=cycle){
            return comp-1;
        }
        return -1;
    }
}