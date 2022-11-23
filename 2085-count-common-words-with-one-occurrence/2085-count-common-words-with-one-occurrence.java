class Solution {
    public int countWords(String[] w1, String[] w2) {
        int l1=w1.length;
        int l2=w2.length;
        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        for(int i=0;i<l1;i++){
            int f=0;
            if(w1[i].equals(" ")){
                f=1;
            }
            for(int j=i+1;j<l1;j++){
                if(w1[i].equals(" ")){
                    f=1;
                    break;
                }
                if(w1[i].equals(w1[j])){
                    f=1;
                    w1[j]=" ";
                }
            }
            if(f==0 )
                list1.add(w1[i]);
        }
        for(int i=0;i<l2;i++){
            int f=0;
            if(w2[i].equals(" ")){
                f=1;
            }
            for(int j=i+1;j<l2;j++){
                if(w2[i].equals(" ")){
                    f=1;
                    break;
                }
                if(w2[i].equals(w2[j])){
                    f=1;
                    w2[j]=" ";
                }
            }
            if(f==0)
                list2.add(w2[i]);
        }
        int count=0;
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i).equals(list2.get(j))){
                    count++;
                }
            }
        }
        return count;
        
    }
}