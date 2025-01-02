class BinarySearch{
public static void main(String arg[]){
int[] arr={11,22,33,44,55,66,77};
int tar=44;
int left=0;
int right=arr.length-1;
boolean found=false;
while(left<=right){
int mid=left+(right-left)/2;
if(arr[mid]==tar){
    System.out.print(tar+" found at index "+ mid);
    found=true;
    break;
    }
    if(arr[mid]<tar){
    left=mid+1;
    }
    }
    if(!found){
    System.out.print(tar+ " not found in the array");
    }
    }
    }