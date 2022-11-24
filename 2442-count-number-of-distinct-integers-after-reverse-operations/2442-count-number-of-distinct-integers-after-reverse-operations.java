class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    // public static int reverse(int temp){
    //     int newEle=0;
    //     int m=1;
    //     while(temp!=0){
    //         int rem=temp%10;
    //         temp/=10;
    //         newEle=newEle*m+rem;
    //         m*=10;
    //     }
    //     return newEle;
    // }
    public static int reverse(int num){
        StringBuffer string = new StringBuffer(String.valueOf(num));
        string.reverse();
        num = Integer.parseInt(String.valueOf(string));
        return num;
    }
}