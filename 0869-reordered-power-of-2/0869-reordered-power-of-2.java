class Solution {
    public void powerarr(int num,int[] ar){
        // int ar[]=new int[10];
        while(num!=0){
            ar[num%10]++;
            num/=10;
        }
    }
    public boolean reorderedPowerOf2(int n) {
        int countN[]=new int[10];
        powerarr(n,countN);
        int powerOfTwo=1;
        while(powerOfTwo<=1000000000){
            int arr[]=new int[10];
            powerarr(powerOfTwo,arr);
            int f=1;
            for(int i=0;i<10;i++){
                if(arr[i]!=countN[i]){
                    f=0;
                    break;
                }
            }
            if(f==1){
                return true;
            }
            powerOfTwo<<=1;
        }
        return false;
    }
}