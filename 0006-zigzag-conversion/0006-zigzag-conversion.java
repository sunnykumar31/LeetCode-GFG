class Solution {
    public String convert(String s, int numRows) {
        int index = 0;
        StringBuilder[] st = new StringBuilder[numRows];
        for (int i = 0; i < st.length; i++) st[i] = new StringBuilder();
        while (index < s.length()) {
            for (int i = 0; i < numRows && index < s.length(); i++) st[i].append(s.charAt(index++));
            for (int i = numRows - 2; i > 0 && index < s.length(); i--) st[i].append(s.charAt(index++));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < st.length; i++) result.append(st[i]);
        return result.toString();
       
    }
}