class Solution {
    public int findCircleNum(int[][] isConnected) {
      HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<isConnected.length;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1) map.get(i).add(j);
            }
        }
        return connected(map);
    }
    public int connected(HashMap<Integer,ArrayList<Integer>> map){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        int count=0;
        for(int i=0;i<map.size();i++){
            if(visited.contains(i)){
                continue;
            }
             q.add(i);
            count++;
            while(!q.isEmpty()){
                int rv=q.remove();
                if(visited.contains(rv)){
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
        // if(count==1) return 0;
        return count;
    }
}