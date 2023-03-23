class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int v1=prerequisites[i][0];
            int v2=prerequisites[i][1];
            map.get(v2).add(v1);
        }
        return Topological(numCourses,map);
    }
    public boolean Topological(int n,HashMap<Integer,ArrayList<Integer>> map){
        int in[]= inDegree(n,map);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int rv=q.remove();
            count++;
            for(int nbrs:map.get(rv)){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        if(count==map.size()){
            return true;
        }
        return false;
    }
    
    public int[] inDegree(int n,HashMap<Integer,ArrayList<Integer>> map){
        int in[]=new int[n];
        for(int i=0;i<n;i++){
            for(int nbrs:map.get(i)){
                in[nbrs]++;
            }
        }
        return in;
        
    }
}