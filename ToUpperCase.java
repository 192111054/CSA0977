import java.util.Scanner;
public class ToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Uppercase: " + str.toUpperCase());
    }
}
