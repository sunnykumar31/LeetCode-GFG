class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(start);
        int len=arr.length;
        while(!q.isEmpty()){
            int rv=q.remove();
            // System.out.println(rv);
            if(arr[rv]==0){
                return true;
            }
            if(visited.contains(rv)){
                continue;
            }
            visited.add(rv);
            if((rv-arr[rv])>=0){
                q.add(rv-arr[rv]);
            }
            if((rv+arr[rv])<len){
                q.add(rv+arr[rv]);
            }
        }
        return false;
    }
}