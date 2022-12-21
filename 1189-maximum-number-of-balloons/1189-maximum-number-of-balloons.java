class Solution {
    public int maxNumberOfBalloons(String text) {
        int ar[]=new int[5];
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='a'){
                ar[0]++;
            }
            else if(text.charAt(i)=='b'){
                ar[1]++;
            }
            else if(text.charAt(i)=='l'){
                ar[2]++;
            }
            else if(text.charAt(i)=='o'){
                ar[3]++;
            }
            else if(text.charAt(i)=='n'){
                ar[4]++;
            } 
        }
        ar[2]/=2;
        ar[3]/=2;
        int min=10001;
        for(int i=0;i<5;i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return  min;
    }
}