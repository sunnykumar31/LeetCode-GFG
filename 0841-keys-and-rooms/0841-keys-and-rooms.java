class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        int count=0;
        for(int i=0;i<rooms.size();i++){
            if(visited.contains(i)){
                continue;
            }
            count++;
            if(count==2){
                return false;
            }
            st.add(i);
            while(!st.isEmpty()){
                int rv=st.pop();
                if(visited.contains(rv)){
                    continue;
                }
                visited.add(rv);
                for(int nbrs:rooms.get(rv)){
                    if(!visited.contains(nbrs)) st.add(nbrs);
                }
            }
        }
        return true;
    }
}