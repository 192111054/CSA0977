class FibonacciSeriesCode{
public static void main(String arg[]){
int a=10;
int n1=0,n2=1;
int nextnumber;
System.out.print("fibonnaci series up to "+a+": ");
while(n1<=a){
System.out.print(n1+" ");
nextnumber=n1+n2;
n1=n2;
n2=nextnumber;
}
}
}
