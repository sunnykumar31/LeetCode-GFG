class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int i=0;
        int j=n-1;
        int sum=skill[i]+skill[j];
        long ans=skill[i]*skill[j];
        i++;
        j--;
        while(i<j){
            if(skill[i]+skill[j]==sum){
                ans=ans+skill[i]*skill[j];
                i++;
                j--;
            }
            else{
                return -1;
            }
        }
        return ans;
    }
}