class Solution {
    public long dividePlayers(int[] skill) {
        //2nd approch without sorting
        int f[]=new int[1001];
        int min=1001;
        int max=0;
        for(int i=0;i<skill.length;i++){
            f[skill[i]]++;
            if(skill[i]<min){
                min=skill[i];
            }
            if(skill[i]>max){
                max=skill[i];
            }
        }
        int k=min+max;
        long ans=0;
        int i=1;
        int j=1000;
        while(i<=j){
            if(f[i]==0) i++;
            else if(f[j]==0) j--;
            else if(f[i]!=f[j] || i+j!=k) return -1;
            else{
                if(i==j){
                    int half=f[i]/2;
                    ans=ans+(long)i*j*half;
                }
                else ans=ans+f[i]*i*j;
                i++;
                j--;
            }
            
        }
        return ans;
        
    }
}