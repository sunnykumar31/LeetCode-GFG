class Solution {
    public int captureForts(int[] forts) {
        int max=0;
        int count=0;
        for(int i=0;i<forts.length;i++){
            if(forts[i]==1){
                for(int j=i+1;j<forts.length;j++){
                    if(forts[j]==0){
                        count++;
                    }
                    else if(forts[j]==-1){
                        if(max<count){
                            max=count;
                        }
                        count=0;
                        break;
                    }
                    else{
                        count=0;
                        break;
                    }
                }
            }
            count=0;
            if(forts[i]==-1){
                for(int j=i+1;j<forts.length;j++){
                    if(forts[j]==0){
                        count++;
                    }
                    else if(forts[j]==1){
                        if(max<count){
                            max=count;
                            
                        }
        
                        count=0;
                        break;
                    }
                    else{
                        count=0;
                        break;
                    }
                }
            }
        }
        return max;
    }
}