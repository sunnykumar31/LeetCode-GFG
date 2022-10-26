class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String rule[]={"type","color","name"};
        int index=-1;
        for(int i=0;i<3;i++){
            if(ruleKey.equals(rule[i])){
                index=i;
                break;
            }
        }
        int count=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}