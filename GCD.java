import java.util.Scanner; 
class GCD { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
System.out.print("Enter the first number: "); 
int a = input.nextInt(); 
System.out.print("Enter the second number: "); 
int b = input.nextInt(); 
int GCD_result = calculateGCD(a, b); 
System.out.println("GCD of " + a + " and " + b + " is: " + GCD_result); 
input.close(); 
} 
public static int calculateGCD(int a, int b) { 
while (b != 0) { 
int temp = b; 
b = a % b; 
a = temp; 
} 
return a; 
} 
}