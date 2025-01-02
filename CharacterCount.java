import java.util.*;
public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character to count: ");
        char ch = scanner.next().charAt(0);
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        System.out.println("The character '" + ch + "' occurs " + count + " times.");
        scanner.close();
    }
}
  