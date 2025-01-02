class SecondSmallest{
public static int SecondSmallest(int[] a,int n){
int temp;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
return a[n-4];
}
public static void main(String[] args){
int a[]={1,2,3,4,5};
System.out.println(SecondSmallest(a,5));
}
}
