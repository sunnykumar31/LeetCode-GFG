class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(map.containsKey(tasks[i])){
                map.put(tasks[i],map.get(tasks[i])+1);
            }
            else{
                map.put(tasks[i],1);
            }
        }
        int ans=0;
        for(int count : map.values()){    
            if(count==1) return -1;
            if(count%3!=0) ans++;  
            ans+=(count/3);
       }  
        return ans;
    }
}