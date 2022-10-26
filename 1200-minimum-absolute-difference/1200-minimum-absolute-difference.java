class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            if(min>diff){
                min=diff;      
            }
        }
        // System.out.print(min);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            List<Integer> l=new ArrayList<>();
            int diff=arr[i+1]-arr[i];
            if(min==diff){
                l.add(arr[i]);
                l.add(arr[i+1]);
                ans.add(l);
            }
        }
        return ans;
    }
}