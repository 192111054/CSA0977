class PrimeOrNot{
public static void main(String arg[])
{
int n=3;
boolean isprime=true;
if(n<2){
isprime=false;
}
else{
for(int i=2;i<=Math.sqrt(n);i++){
if(n%i==0){
isprime=false;
break;
}
}
}
if(isprime){
System.out.print(n +  "prime number");
}
else{
System.out.print(n +  "not a prime number");
}
}
}