class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int count=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
                count++;
            }
            else{
                count++;
                j--;
            }
        }
        return count;
    }
}