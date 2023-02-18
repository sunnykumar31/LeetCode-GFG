class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        if(target==-294967296) return ans;
        Set<List<Integer>> res  = new HashSet<>();
        Arrays.sort(nums);
        int ls=nums.length;
        for(int first=0;first<nums.length-3;first++){
            for(int sec=first+1;sec<nums.length-2;sec++){
                    List<Integer> list=new ArrayList<>();
                    int i=sec+1;
                    int j=ls-1;
                    while(i<j){
                        long tar=nums[i]+nums[first]+nums[j]+nums[sec];
                        if(target==tar){
                            list.add(nums[first]);
                            list.add(nums[sec]);
                            list.add(nums[i++]);
                            list.add(nums[j--]);
                            res.add(list);
                            list=new ArrayList<>();
                            // break;
                        }
                        else if(target>tar){
                            i++;
                        }
                        else if(target<tar){
                            j--;
                        }
                    }
            }
                    // i++;
            // j--;
            
        }
        ans=new ArrayList<>(res);
        return ans;
    }
}