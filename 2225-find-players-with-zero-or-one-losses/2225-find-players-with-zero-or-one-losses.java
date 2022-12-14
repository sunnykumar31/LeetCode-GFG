class Solution {
    public List<List<Integer>> findWinners(int[][] m) {
        int len_w=0;
        int len_l=0;
        for(int i=0;i<m.length;i++){
            if(m[i][0]>len_w){
                len_w=m[i][0]; // finding maximum of winner 
            }
            if(m[i][1]>len_l){
                len_l=m[i][1];  //finding minimum of losser
            }
        }
        len_w++; // just for array length 
        len_l++;
        int ar_w[]=new int[len_w];
        int ar_l[]=new int[len_l];
        for(int i=0;i<m.length;i++){
            ar_w[m[i][0]]++;    // making frequency array of winner
            ar_l[m[i][1]]++;    // making frequency arrray of looser
        }
        List<Integer> list_w=new ArrayList<>();
        List<Integer> list_l=new ArrayList<>();
        int i=1;
        for(;i<len_w;i++){
            if(len_l-1<i || ar_l[i]==0){  // if looser length length is less than winner or not present in looser array then its mean that it will never loose
                if(ar_w[i]!=0)  //and also in winner array  that ele must be present.
                    list_w.add(i);
            }
            else if(ar_l[i]==1){ // if one loss only
                list_l.add(i);
            }
        }
        if(len_l>len_w){ // if for winner array is less than looser array 
            while(i<len_l){
                if(ar_l[i]==1){
                    list_l.add(i);
                }
                i++;
            }
        }
        Collections.sort(list_w);
        Collections.sort(list_l);
        List<List<Integer>> list=new ArrayList<>();
        list.add(list_w);
        list.add(list_l);
        return list;
    }
}