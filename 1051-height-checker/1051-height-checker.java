class Solution {
    public int heightChecker(int[] heights) {
        int l=heights.length;
        int ar[]=new int[l];
        for(int i=0;i<l;i++){
            ar[i]=heights[i];
        }
        Arrays.sort(ar);
        int count=0;
        for(int i=0;i<l;i++){
            if(ar[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}