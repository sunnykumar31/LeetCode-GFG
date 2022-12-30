/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int si=1;
        int ei=n;
        int ans=0;
        while(si<=ei){
            int mid=ei-(ei-si)/2;
            if(isBadVersion(mid)==true){
                ans=mid;
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
}