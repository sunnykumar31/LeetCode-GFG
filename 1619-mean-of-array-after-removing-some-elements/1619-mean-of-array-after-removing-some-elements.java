class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len=arr.length;
        int exclud=(len*5)/100;
        long sum=0;
        int n=0;
        for(int i=exclud;i<len-exclud;i++){
            sum+=arr[i];
            n++;
        }
        System.out.println(len+" "+sum+" "+n);
        return (double)sum/n;
    }
}