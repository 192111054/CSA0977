import java.util.Scanner;
public class StringEndsWithSuffix
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the string");
String str=input.nextLine();
String suffix=input.nextLine();
if(str.endsWith(suffix))
{
System.out.println("The string ends with suffix");
}
else
{
System.out.println("The string does not end with Suffix");
}
}
}
