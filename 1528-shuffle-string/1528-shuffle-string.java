class Solution {
    public String restoreString(String s, int[] indices) {
        char tempar[] = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            tempar[indices[i]] = s.charAt(i);
        }
        return new String(tempar);
    }
}