class Solution {
    public int[] vowelStrings(String[] w, int[][] q) {
        int f[]=new int[w.length];
        int prefix_Sum=0;
        for(int j=0;j<w.length;j++){
            String s=w[j];
            int l=s.length()-1;
            char c1=s.charAt(0);
            char c2=s.charAt(l);
            if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u'){
                if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u'){
                    prefix_Sum++;
                }
            }
            f[j]=prefix_Sum;
        }
        int n=q.length;
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            int l1=q[i][0];
            int r1=q[i][1];
            if(l1>0){
                ar[i]=f[r1]-f[l1-1];
            }
            else ar[i]=f[r1];
        }
        return ar;
    }
}