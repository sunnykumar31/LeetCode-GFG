class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();
        Arrays.sort(nums);
        int ls=nums.length;
        for(int first=0;first<nums.length-2;first++){
                    List<Integer> list=new ArrayList<>();
                    int i=first+1;
                    int j=ls-1;
                    while(i<j){
                        int target=nums[i]+nums[first]+nums[j];
                        if(target==0){
                            list.add(nums[first]);
                            list.add(nums[i++]);
                            list.add(nums[j--]);
                            res.add(list);
                            list=new ArrayList<>();
                            // break;
                        }
                        else if(target<0){
                            i++;
                        }
                        else if(target>0){
                            j--;
                        }
                    }
                    // i++;
            // j--;
            
        }
        List<List<Integer>> ans=new ArrayList<>(res);
        return ans;
    }
} 