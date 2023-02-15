class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int l=num.length-1;
        int carry=0;
        while(l>=0 && k!=0){
            int sum=num[l]+k%10+carry;
            if(sum>9) carry=1;
            else carry=0;
            list.add(sum%10);
            l--;
            k/=10;
        }
        while(l>=0){
            int sum=num[l]+carry;
            if(sum>9) carry=1;
            else carry=0;
            list.add(sum%10);
            l--;
        }
        while(k!=0){
            int sum=k%10+carry;
            if(sum>9) carry=1;
            else carry=0;
            list.add(sum%10);
            k/=10;
        }
        if(carry==1) list.add(carry);
        Collections.reverse(list);
        return list;
    }
}