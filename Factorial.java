import java.util.Scanner;
class Factorial
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter a number:");
int num=scanner.nextInt();
int fact=1,i;
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("factorial of " +num+ "is" +fact);
}
}