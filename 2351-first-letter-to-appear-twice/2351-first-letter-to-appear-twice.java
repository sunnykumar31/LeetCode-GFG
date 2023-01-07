class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))==1) return s.charAt(i);
            else map.put(s.charAt(i),1);
        }
        return 'a';
    }
}