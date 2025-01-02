import java.util.Scanner;
class DecimalToBinary {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter decimal number: ");
int decimal=sc.nextInt();
String binary=Integer.toBinaryString(decimal);
System.out.println("Binary value= "+binary);
}
}
