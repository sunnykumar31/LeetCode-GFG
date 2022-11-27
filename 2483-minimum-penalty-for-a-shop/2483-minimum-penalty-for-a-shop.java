class Solution {
    public int bestClosingTime(String c) {
        // simple approch TLE 
        
        // int index=0;
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<c.length()+1;i++){
        //     int count=0;
        //     for(int j=0;j<c.length();j++){
        //         char ch=c.charAt(j);
        //         if(j<i){
        //             if(ch=='N'){
        //                 count++;
        //             }
        //         }
        //         else{
        //             if(ch=='Y'){
        //                 count++;
        //             }
        //         }
        //     }
        //     // System.out.println(min);
        //     if(count<min){
        //         min=count;
        //         index=i;
        //     }
        // }
        // return index;
        
        
        
        int l=c.length();
        int arY[]=new int[l+1];
        int arN[]=new int[l+1];
        // for(int i=l-1;i>=0;i--){
        //     if(c.charAt(i)=='Y'){
        //         arY[i]=arY[i+1]+1;
        //     }
        // }
        // for(int i=0;i<l;i++){
        //     if(c.charAt(i)=='N'){
        //         arN[i+1]=arN[i]+1;
        //     }
        // }
		int count=0;
		for(int i=l-1;i>=0;i--) {
			if(c.charAt(i)=='Y') count++;
			arY[i]=count;
		}
		count=0;
		for(int i=0;i<l;i++) {
			if(c.charAt(i)=='N') count++;
			arN[i+1]=count;
		}

        int ans[]=new int[arY.length];
		int min=Integer.MAX_VALUE;
		int res=0;
		for(int i=0;i<arY.length;i++) {
			int sum=arY[i]+arN[i];
			if(min>sum) {
				min=sum;
				res=i;
             //   System.out.println(no[customers.length()-1]);
			}
            
		}
		return res;
        
        
        
    }
}