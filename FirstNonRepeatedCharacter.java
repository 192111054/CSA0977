import java.util.Scanner;
public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        for (char c : input.toCharArray()) {
            if (input.indexOf(c) == input.lastIndexOf(c)) {
                System.out.println("First non-repeated character: " + c);
                return;
            }
        }
        System.out.println("No unique character found.");
    }
}
