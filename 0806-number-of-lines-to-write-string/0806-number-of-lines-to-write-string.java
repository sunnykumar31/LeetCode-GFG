class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int pixel=0;
        int count=0;
        int f=0;
        for(int i=0;i<s.length();i++){
            pixel+=widths[s.charAt(i)-97];
            if(pixel==100){
                count++;
                pixel=0;
                f=1;
            }
            else if(pixel>100){
                pixel=widths[s.charAt(i)-97];
                count++;
                f=0;
            }
        }
        int ar[]=new int[2];
        if(pixel>0){
            ar[0]=count+1;
            ar[1]=pixel;
        }
        else{
            if(f==1){
                ar[1]=100;
                ar[0]=count;
            }
            else{
                ar[1]=pixel;
                ar[0]=count;
            }
            
        }
        
        return ar;
    }
}