class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        //brute forces
        String s[]=new String[names.length];
        for(int i=0;i<heights.length;i++){
            int max=0;
            int index=-1;
            for(int j=0;j<heights.length;j++){
                if(max<heights[j]){
                    max=heights[j];
                    index=j;
                }
            }
            s[i]=names[index];
            heights[index]=0;
        }
        return s;
    }
}