class Solution {
    public int findMinFibonacciNumbers(int k) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        int a=1;
        int b=1;
        int c=0;
        list.add(1);
        list.add(1);
        while(c<=k){
            c=a+b;
            list.add(c);
            a=b; 
            b=c;
        }
        int j=list.size()-1;
        while(k!=0){
            c=list.get(j);
            // System.out.println(c);
            if(c<=k){
                count++;
                k=k-c;
            }
            else{
                j--;
            }
        }
        return count;
    }
}