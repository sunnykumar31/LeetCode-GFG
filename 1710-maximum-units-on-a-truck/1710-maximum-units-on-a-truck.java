class Solution {
    public int maximumUnits(int[][] box, int truckSize) {
        int n=box.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int max=0;
            int index=-1;
            if(truckSize==0){
                return ans;
            }
            for(int j=0;j<n;j++){
                if(max<box[j][1]){
                    max=box[j][1];
                    index=j;
                }
            }//maximum nikale unssko use ans nikale fir maximum wale index ko miminum kre taki baad m repeat na ho fir jb truckSize ki requirement pura to return kro ans;
            if(truckSize>=box[index][0]){
                ans=ans+box[index][0]*box[index][1];
                truckSize-=box[index][0];
                box[index][1]=0;
            }
            else{
                ans+=truckSize*box[index][1];
                truckSize=0;
            }
            
        }
        return ans;
    }
}