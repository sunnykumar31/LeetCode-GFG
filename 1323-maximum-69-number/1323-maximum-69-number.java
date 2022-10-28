class Solution {
    public int maximum69Number (int num) {
        // String s=Integer.toString(num);
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='6'){
        //         s=s.replaceFirst("6","9");
        //         return Integer.valueOf(s); 
        //     }
        // }
        // return num;
        
        // Math //remainder//3*100xx to 6*100xx making it 900xx
        
        int temp=num;
        int max=0;
        int pos=1;
        
        while(temp!=0){
            int rem=temp%10;
            if(rem==6){
                max=3*pos;
            }
            pos*=10;
            temp/=10;
        }
        return num+max; 
    }
}