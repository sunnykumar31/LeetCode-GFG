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
        //array ki jo bhi value hai, same utna hi times same value jis jis index pe present hai usko list m daal do ,or count esliye lgaya qki jitni value hai utni baar hi list m store krna hai or jaha mil rha hai us index ko store krne k baad us index k value ko -1 se override kr dena hai taki ye pta rhe ki us value ko hum consider kr chuke hai ya repetation ko rokne k liye elsiye upr negative wala condition lga hai.
    }
}