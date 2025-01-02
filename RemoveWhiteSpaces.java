import java.util.Scanner;
public class RemoveWhiteSpaces
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the String:");
String s=input.nextLine();
String s1=s.replaceAll(" ","");
System.out.print(s1);
}
}