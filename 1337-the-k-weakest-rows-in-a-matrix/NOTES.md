int n=mat.length;
int m=mat[0].length;
int ar[]=new int[n];
for(int i=0;i<n;i++){
int j=0;
int k=m-1;
while(j<=k){
int mid=(j+k)/2;
if(mat[i][mid]==1){
j=mid+1;
}
else if(mat[i][mid]==0){
k=mid-1;
}
}
ar[i]=j;
}
return ar;
}