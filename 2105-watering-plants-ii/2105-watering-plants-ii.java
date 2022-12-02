class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int count=0;
        int capA=capacityA;
        int capB=capacityB;
        int i=0;
        int j=plants.length-1;
        while(i<=j){
            if(i==j){
                if(plants[i]>capA && plants[i]>capB){
                    count++;
                }
                break;
            }
            if(plants[i]>capA){
                count++;
                capA=capacityA;
            }
            if(plants[j]>capB){
                count++;
                capB=capacityB;
            }
            capA-=plants[i];
            capB-=plants[j];
            i++;
            j--;
        }
        return count;
    }
}