class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();
        Arrays.sort(nums);
        int ls=nums.length;
        for(int first=0;first<nums.length-2;first++){
            for(int scnd=first+1;scnd<nums.length-1;scnd++){
                int remain=0-(nums[first]+nums[scnd]);
                if(remain<=nums[ls-1]){
                    List<Integer> list=new ArrayList<>();
                    int i=scnd+1;
                    int j=ls-1;
                    while(i<=j){
                        int mid=(i+j)/2;
                        if(nums[mid]==remain){
                            list.add(nums[first]);
                            list.add(nums[scnd]);
                            list.add(nums[mid]);
                            res.add(list);
                            break;
                        }
                        else if(remain<=nums[mid]){
                            j=mid-1;
                        }
                        else{
                            i=mid+1;
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(res);
        return ans;
    }
} 