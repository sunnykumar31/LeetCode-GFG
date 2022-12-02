class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int count=0;
        int capA=capacityA;
        int capB=capacityB;
        int i=0;
        int j=plants.length-1;
        while(i<=j){
            if(i==j){ // when both of index is same than check if both of water is less than required than we have to refill the pot 
                if(plants[i]>capA && plants[i]>capB){
                    count++;
                }
                break;
            }
            if(plants[i]>capA){ // water is less as per requirement then  refile the pot
                count++;
                capA=capacityA;
            }
            if(plants[j]>capB){
                count++;
                capB=capacityB;// same as capB 
            }
            capA-=plants[i]; // after giving water ,remaming water in pot
            capB-=plants[j];
            i++;
            j--;
        }
        return count;
    }
}