        // Explation agr name character match krta hai type se to hum pointer j ko increase kr denge mtlb ab next charcter k liye check krenge then next k liye jayenge agr fir se match kr gya to matlb hai previous charcter ka long pressed nhi huaa hai agr prvious charcacter long pressed huaa to simple typed ka pointer aage bdh jayega ek case or create hota hai agr long pressed bhi nhi huaa or charcter name k bhi us pointer se nhi milta hai to iska mtlb hai diff hai to false return krega

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int ln=name.length(),lt=typed.length();
        int j=0;
        for(int i=0;i<lt;i++){
            if(j<ln && name.charAt(j)==typed.charAt(i)){
                j++;
            }
            else if(i==0 ||typed.charAt(i)!=typed.charAt(i-1)){
                return false;
            }
        }
        return j==ln;
    }
}