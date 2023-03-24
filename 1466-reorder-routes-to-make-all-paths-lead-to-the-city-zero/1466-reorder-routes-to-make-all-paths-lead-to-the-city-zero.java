class Solution {
    public int minReorder(int n, int[][] connections) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        HashMap<Integer,ArrayList<Integer>> map1=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
            map1.put(i,new ArrayList<>());
        }
        for(int i=0;i<connections.length;i++){
            map.get(connections[i][0]).add(connections[i][1]);
            map1.get(connections[i][0]).add(connections[i][1]);
            map1.get(connections[i][1]).add(connections[i][0]);
        }
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(0);
        while(!q.isEmpty()){
            int rv=q.remove();
            if(visited.contains(rv)){
                continue;
            }
            visited.add(rv);
            for(int nbrs:map1.get(rv)){
                if(!visited.contains(Math.abs(nbrs))){
                    if(map.get(rv).contains(nbrs)){
                        count++;
                    }
                    q.add(nbrs);
                }
                
            }
        }
        return count;
    }
}