class GCDCode{
public static void main(String arg[]){
int n1=12,n2=7;
int a=n1,b=n2;
int gcd;
while(n2!=0)
{
gcd=n2;
n2=n1%n2;
n1=gcd;
}
System.out.print("gcd is :"+n1+"\n");
}
}