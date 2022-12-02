class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int cap=capacity;
        for(int i=0;i<plants.length;i++){
            // if(plants[i]<=cap){
            //     count++;
            //     cap-=plants[i];
            // }
            // else{
            //     count=count+i+i; 
            //     cap=capacity;
            //     i--;
            // }
            if(plants[i]>cap){
                count=count+2*i;
                cap=capacity;
            }
            count++;
            cap-=plants[i];
        }
        return count;
    }
}