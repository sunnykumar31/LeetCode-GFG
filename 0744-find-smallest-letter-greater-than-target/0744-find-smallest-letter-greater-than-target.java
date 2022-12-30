class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0;
        int j=letters.length-1;
        while(i<=j){
            int mid=j-(j-i)/2;
            if(letters[mid]<=target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return letters[i%letters.length];
    }
}