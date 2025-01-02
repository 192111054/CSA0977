import java.util.Scanner;
public class BinaryToDecimal {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a binary number: ");
String binary = scanner.nextLine();
int decimal = 0;
int power = 0;
for (int i = binary.length() - 1; i >= 0; i--) {
int digit = Character.getNumericValue(binary.charAt(i));
decimal += digit * Math.pow(2, power++);
}
System.out.println("The decimal equivalent is: " + decimal);
}
}