class Solution {
    public static void lexco(int n,int curr,List<Integer> l){
        if(curr>n){
            return;
        }
        l.add(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            lexco(n,10*curr+i,l);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        // list.add(0);
        lexco(n,0,list);
        list.remove(0);
        return list;
    }
}