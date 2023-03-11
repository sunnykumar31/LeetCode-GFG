class Solution {
    public static void reverse(int rev[],int nums[]){
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int r=0;
            while(temp!=0){
                r=r*10+temp%10;
                temp/=10;
            }
            rev[i]=r;
        }
    }
    public int countNicePairs(int[] nums) {
        int rev[]=new int[nums.length];
        reverse(rev,nums);
        for(int i=0;i<nums.length;i++){
            rev[i]=nums[i]-rev[i];
            // System.out.println(rev[i]);
        }
        long Finalcount=0;
        long count=0;
        Arrays.sort(rev);
        for(int i=1;i<rev.length;i++){
            if(rev[i]!=rev[i-1]){
                long c=(((count+1)*count)/2)%1000000007;
                Finalcount=(Finalcount+(c))%1000000007;
                // System.out.println(Finalcount);
                count=0;
            }
            else count++;
        }
        long c=(((count+1)*count)/2)%1000000007;
        Finalcount=(Finalcount+(c))%1000000007;
        return (int)Finalcount;
    }
}