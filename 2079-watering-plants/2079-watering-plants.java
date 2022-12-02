class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int cap=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]>cap){
                count=count+2*i; //us index k piche ja kr river se pani lane ka then river se pani lekr ane ka duri 
                cap=capacity;
            }
            count++; // requirement fulfill kr k aage ek step bdhne ka;
            cap-=plants[i];
        }
        return count;
    }
}