class Solution {
    public int minimumSum(int num) {
        int ar[]=new int[4];
        int i=0;
        int temp=num;
        while(temp!=0){
            ar[i]=temp%10;
            temp/=10;
            i++;
        }
        Arrays.sort(ar);
        int count=0;
        for(int j=0;j<4;j++){
            if(ar[j]==0){
                count++;
            }
        }
        if(count==0){
            return (ar[0]*10+ar[3])+(ar[1]*10+ar[2]);
        }
        if(count==1){
            return ar[1]*10+ar[2]+ar[3];
        }
        if(count==2){
            return ar[2]+ar[3];
        }
        return ar[3];
    }
}