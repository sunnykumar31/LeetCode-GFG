class Solution {
    public List<List<Integer>> groupThePeople(int[] gS) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<gS.length;i++){
            List<Integer> list=new ArrayList<>();
            if(gS[i]>0){
                list.add(i);
                int count=1;
                for(int j=i+1;j<gS.length;j++){
                    if(count==gS[i]){
                        break;
                    }
                    if(gS[j]==gS[i]){
                        list.add(j);
                        gS[j]=-1;
                        count++;
                    }
                    
                }
            }
            if(list.size()>0){
                ans.add(list);
            }
        }
        return ans;
    }
}