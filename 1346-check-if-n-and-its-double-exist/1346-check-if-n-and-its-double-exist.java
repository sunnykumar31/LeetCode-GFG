class Solution {
    public boolean checkIfExist(int[] arr) {
        //n2 approch
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if((arr[i]==(2*arr[j])) ||(arr[j]==(2*arr[i]))){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        //by haset TC(n);
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i]*2) || (arr[i]%2==0 && hs.contains((arr[i])/2))) return true;
            hs.add(arr[i]);
        }
        return false;
        //explantion if arr contains twice of element or if arr element if even and its half contin then also return ture 
    }
}