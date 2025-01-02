import java.util.Scanner;
public class PowerOfNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the base number: ");
int base = scanner.nextInt();
System.out.print("Enter the exponent: ");
int exponent = scanner.nextInt();
int result = 1;
if (exponent == 0) {
result = 1;
} else if (exponent > 0) {
for (int i = 1; i <= exponent; i++) {
result *= base;
}
} else {
System.out.println("Exponent cannot be negative.");
return;
}
System.out.println(base + "^" + exponent + " = " + result);
}
}