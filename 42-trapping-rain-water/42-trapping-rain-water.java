class Solution {
    public int trap(int[] ar) {
//         int n=height.length;
//         int c=0;
//         for(int i=0;i<n;i++){
//             if(height[i]==0){
//                 c++;
//             }
//             else{
//                 break;
//             }
//         }
//         int j=c;
//         if(j==n){
//             return 0;
//         }
//         int count=0;
//         while(j<n-1){
//             if(height[j]<=height[j+1]){
//                 j++;
//             }
//             else{
//                 int k=j;
//                 while( j<n-1 && height[k]>height[j+1]){
//                     j++;
//                 }
//                 j++;
//                 if(j==n){
//                     if(height[k]>height[n-1]){
//                         j=k+1;
//                     }
//                 }
//                 else{
//                     int p=k;
//                     while(k<j-1){
//                         k++;
//                         count=count+(height[p]-height[k]);
//                         System.out.print(count+" ");

//                     }
//                 }
//             }
//         }
//         return count;
        
        
//         int n=height.length;
//         if(n==1 || n==2){
//             return 0;
//         }
//         int i=0;
//         int j=n-1;
//         int sum=0;
//         int left=0;
//         int right=0;
//         while(i<j){
//             if(height[i]<=height[j]){
//                 if(height[i]>=left){
//                     left=height[i];
//                 }
//                 else{
//                     sum=sum+left-height[i];
//                 }
//                 i++;
//             }
//             else{
//                 if(height[j]>=right){
//                     right=height[j];
//                 }
//                 else{
//                     sum=sum+right-height[j];
//                 }
//                 j--;
//             }
//         }
//         return sum;
        
        if(ar.length==1 || ar.length==2){
			return 0;
		}
		int si=0;
		int lt=ar.length-1;
		int leftsi=0;
		int rightlt=0;
		int count=0;
		while(si<lt){
			if(ar[si]<=ar[lt]){
				if(ar[si]>=leftsi){
					leftsi=ar[si];
				}
				else{
					count+=leftsi-ar[si];
				}
				si++;
			}
			else{
				if(ar[lt]>=rightlt){
					rightlt=ar[lt];
				}
				else{
					count+=rightlt-ar[lt];
				}
				lt--;
			}
		}
		return count;
	
    }
}