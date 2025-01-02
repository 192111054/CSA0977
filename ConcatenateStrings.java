import java.util.Scanner;
public class ConcatenateStrings
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the String-1:");
String s1=input.nextLine();
System.out.println("Enter the String-2:");
String s2=input.nextLine();
String s3=s1+" "+s2;
System.out.print(s3);
}
}
