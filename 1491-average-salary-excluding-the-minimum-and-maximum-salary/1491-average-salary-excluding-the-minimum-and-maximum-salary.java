class Solution {
    public double average(int[] salary) {
        double sum=salary[0];
        double min=salary[0];
        double max=salary[0];
        for(int i=1;i<salary.length;i++){
            if(min>salary[i]){
                min=salary[i];
            }
            if(max<salary[i]){
                max=salary[i];
            }
            sum+=salary[i];
        }
        // double l=salary.length-2;
        double avg=sum-(min+max);
        return avg/(salary.length-2);
    }
}