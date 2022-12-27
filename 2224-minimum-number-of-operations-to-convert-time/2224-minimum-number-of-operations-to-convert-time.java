class Solution {
    public int convertTime(String current, String correct) {
        int hcur=Integer.parseInt(current.substring(0,2));
        int mcur=Integer.parseInt(current.substring(3));
        int hcor=Integer.parseInt(correct.substring(0,2));
        int mcor=Integer.parseInt(correct.substring(3));
        int min=(60*hcor+mcor)-(60*hcur+mcur);
        int ans=0;
        if(min>=60){
            ans+=min/60;
            min%=60;
        }
        if(min>=15){
            ans+=min/15;
            min%=15;
        }
        if(min>=5){
            ans+=min/5;
            min%=5;
        }
        if(min<=4){
            ans+=min;
        }
        return ans;
    }
}