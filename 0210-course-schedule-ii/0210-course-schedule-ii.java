class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
    public int[] Topological(int n,HashMap<Integer,ArrayList<Integer>> map){
        int in[]= inDegree(n,map);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        int idx=0;
        int ans[]=new int[map.size()];
        while(!q.isEmpty()){
            int rv=q.remove();
            ans[idx++]=rv;
            for(int nbrs:map.get(rv)){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        if(map.size()==idx){
            return ans;
        }
        else{
            int ans1[]=new int[0];
            return ans1;
        }
        
    }
    
    public int[] inDegree(int n,HashMap<Integer,ArrayList<Integer>> map){
        int in[]=new int[n];
        for(int key:map.keySet()){
            for(int nbrs:map.get(key)){
                in[nbrs]++;
            }
        }
        return in;
         
    }
}