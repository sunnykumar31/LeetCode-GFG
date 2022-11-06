class Solution {
    public int[][] merge(int[][] itr) {
        // List<Integer<Integer>> ans=new ArrayList<>();
        int ari[]=new int[itr.length];
        int arj[]=new int[itr.length];
        for(int i=0;i<itr.length;i++){
            ari[i]=itr[i][0];
            arj[i]=itr[i][1];
        }
        Arrays.sort(ari);
        Arrays.sort(arj);
        for(int i=0;i<itr.length;i++){
            itr[i][0]=ari[i];
            itr[i][1]=arj[i];
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<itr.length-1;i++){
            if(itr[i][0]>itr[i+1][0] && itr[i][1]>itr[i+1][1]){
                int temp=itr[i][0];
                itr[i][0]=itr[i+1][0];
                itr[i+1][0]=temp;
                temp=itr[i][1];
                itr[i][1]=itr[i+1][1];
                itr[i+1][1]=temp;
            }
            if(itr[i][1]>=itr[i+1][0]){
                if(itr[i][0]<=itr[i+1][0]){
                    itr[i+1][0]=itr[i][0];
                }
                if(itr[i][1]>=itr[i+1][1]){
                    itr[i+1][1]=itr[i][1];
                }
            }
            else{
                l.add(itr[i][0]);
                l.add(itr[i][1]);
            }   
        }
        l.add(itr[itr.length-1][0]);
        l.add(itr[itr.length-1][1]);
        int ans[][]=new int[l.size()/2][2];
        int j=0;
        for(int i=0;i<l.size()/2;i++){
            ans[i][0]=l.get(j);
            j++;
            ans[i][1]=l.get(j);
            j++;
        }
        return ans;
    }
}