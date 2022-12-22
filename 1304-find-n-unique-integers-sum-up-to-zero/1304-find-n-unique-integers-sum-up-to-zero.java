class Solution {
    public int[] sumZero(int n) {
        int ar[]=new int[n];
        int j=1;
        n=n-(n%2);//for making even qki odd k liye ek zero by default present hai or even k positive and usi positive value ka negative ese sum zero
        for(int i=0;i<n;i+=2){
            ar[i]=j;
            ar[i+1]=-j;
            j++;
        }
        return ar;
    }
}