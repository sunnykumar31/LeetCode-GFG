class Solution {
    public int[][] insert(int[][] itr_actual, int[] newitr) {
        // List<Integer<Integer>> ans=new ArrayList<>();
        int len=itr_actual.length;
        int ari[]=new int[len+1];
        int arj[]=new int[len+1];
        // coping the in  ari of 0 col element and arj of col 1
        int index_i=0;
        int index_j=0;
        int f1=0;
        int f2=0;
        //for col 0 adding newitr element
        for(int i=0;i<len;i++){
            if(itr_actual[i][0]<newitr[0]){
                ari[i]=itr_actual[i][0];
            }
            else{
                ari[i]=newitr[0];
                index_i=i;
                f1=1;
                break;
            }
        }
        if(f1==0){
            ari[len]=newitr[0];
        }
        else{
            for(int i=index_i;i<len;i++){
                ari[i+1]=itr_actual[i][0];
            }
        }
        
        // System.out.println(ari[len]);
        //for col 1 adding newitr element
        for(int i=0;i<len;i++){
            if(itr_actual[i][0]<newitr[1]){
                arj[i+index_j]=itr_actual[i][1];
            }
            else{
                arj[i+index_j]=newitr[1];
                index_j=i;
                f2=1;
                break;
            }
        }
        if(f2==0){
            arj[len]=newitr[1];
        }
        else{
            for(int i=index_j;i<len;i++){
                arj[i+1]=itr_actual[i][1];
            }
        }
        //copying all the 
        int itr[][]=new int[len+1][2];
        for(int i=0;i<len+1;i++){
            itr[i][0]=ari[i];
            itr[i][1]=arj[i];
            // System.out.println(itr[i][0]+" "+itr[i][1]);
        }
        // System.out.println(itr[len][1])
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