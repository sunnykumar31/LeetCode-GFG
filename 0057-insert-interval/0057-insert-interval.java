class Solution {
    public int[][] insert(int[][] itr1, int[] newitr) {
        // List<Integer<Integer>> ans=new ArrayList<>();
        int len=itr1.length;
        int ari[]=new int[len+1];
        int arj[]=new int[len+1];
        ari[0]=newitr[0];
        arj[0]=newitr[1];
        // coping the in  ari of 0 col element and arj of col 1
        for(int i=0;i<len;i++){
            ari[i+1]=itr1[i][0];
            arj[i+1]=itr1[i][1];
        }
        // sorting col0 and col1;
        Arrays.sort(ari);
        Arrays.sort(arj);
        int itr[][]=new int[len+1][2];
        // then coping sorted element in sorted array
        for(int i=0;i<len+1;i++){
            itr[i][0]=ari[i];
            itr[i][1]=arj[i];
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<len;i++){
            // if y of current row is greater than x of next row then overlapping occur
            if(itr[i][1]>=itr[i+1][0]){
                // if x of current row is less than or equal than copy the value of x in next row;
                if(itr[i][0]<=itr[i+1][0]){
                    itr[i+1][0]=itr[i][0];
                }
                //if y of current row is greater than or equal than copy the value of y in next row;
                if(itr[i][1]>=itr[i+1][1]){
                    itr[i+1][1]=itr[i][1];
                }
            }
            // if overlaping is not occur 
            
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