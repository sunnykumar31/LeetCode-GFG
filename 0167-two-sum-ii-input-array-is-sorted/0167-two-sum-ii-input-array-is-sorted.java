class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
        //         for(int i=0;i<numbers.length;i++){
//             for(int j=i+1;j<numbers.length;j++){
//                 if(target==numbers[i]+numbers[j]){
//                     arr[0]=++i;
//                     arr[1]=++j;
                    
//                     return arr;
//                 }
//             }
//         }
//         return arr;
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int sumofNo=numbers[i]+numbers[j];
            if(target==sumofNo){
                arr[0]=++i;
                arr[1]=++j;
                return arr;
            }
            if(sumofNo<target){
                i++;
            }
            else{
                j--;
            }
            
        }
        return arr;
    }
}