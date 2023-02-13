class Solution {
    public int distinctPrimeFactors(int[] nums) {
        boolean isNotprime[]=new boolean[1001];
        primeSeive(isNotprime);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int j=2;
            while(j<=temp){
                if(!isNotprime[j] && temp%j==0){
                    set.add(j);
                }
                if(temp%j==0){
                    temp/=j;
                }
                j++;
            }
        }
        return set.size();
    }
    public static void primeSeive(boolean ar[]){
        ar[0]=true;
        ar[1]=true;
        for(int i=2;i<ar.length;i++){
            if(ar[i]==false){
                for(int j=2;j*i<ar.length;j++){
                    ar[i*j]=true;
                }
            }
        }
        return;
    }
}