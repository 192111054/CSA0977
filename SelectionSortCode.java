class SelectionSortCode{
public static void main(String arg[]){
int[] arr={64,25,12,22,11};
for(int i=0;i<arr.length-1;i++)
{
int minIndex=i;
for(int j=i+1;j<arr.length;j++){
if(arr[j]<arr[minIndex]){
minIndex=j;
}
}
int temp=arr[minIndex];
arr[minIndex]=arr[i];
arr[i]=temp;
}
System.out.print("sorted array:");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+ " ");
}
}
}