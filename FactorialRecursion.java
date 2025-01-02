import java.util.Scanner;
class FactorialRecursion {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number n:");
int n=sc.nextInt();
int factorial=f(n);
System.out.println("Factorial is:"+factorial);
}
public static int f(int n) {
if(n==0) {
return 1;
}
else {
return n*f(n-1);
}
}
}