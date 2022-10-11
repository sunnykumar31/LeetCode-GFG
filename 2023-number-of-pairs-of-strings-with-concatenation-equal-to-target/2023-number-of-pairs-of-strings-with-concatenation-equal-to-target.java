class Solution {
    public int numOfPairs(String[] nums, String target) {
        //O(n2)
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String str="";
                str=nums[i]+nums[j];
                if(str.equals(target)){
                    count++;
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                String str="";
                str=nums[i]+nums[j];
                if(str.equals(target)){
                    count++;
                }
            }
        }
        return count;
    }
}