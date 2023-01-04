class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        if(arr.length==2) return arr;
        int NoOf1bit[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            int n=arr[i];
            while(n>0){
                count=(n%2==1)?++count:count;
                n/=2;
              //   count+=((n&1)==1)? 1:0;
              // n>>=1;

            }
            NoOf1bit[i]=count;
        }
        int ans[]=new int[arr.length];
        int idx=0;
        for(int i=0;i<14;i++){// 14 se km esliye qki arr[i]<=10^4 se jada nhi ho skta
            for(int j=0;j<arr.length;j++){
                if(NoOf1bit[j]==i){
                    ans[idx++]=arr[j];
                }
            }
        }
        return ans;
    }
}