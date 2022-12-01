class Solution {
    public int[] maxSlidingWindow(int[] ar, int k) {
        int ans[]=new int[ar.length-k+1];
        return maxWindow(ar,k,ans);
    }
    public static int[] maxWindow(int ar[],int k,int ans[]){
        Deque<Integer> dq=new LinkedList<>();
        int j=1;
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && ar[i]>ar[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        ans[0]=ar[dq.getFirst()];
        for(int i=k;i<ar.length;i++){
            while(!dq.isEmpty() && ar[i]>ar[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
            if(!dq.isEmpty() && dq.getFirst()==i-k){
                dq.removeFirst();
            }
            ans[j]=ar[dq.getFirst()];
            j++;
        }
        return ans;
    }
}