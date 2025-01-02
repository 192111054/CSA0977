import java.util.Scanner;
public class IndexOfaGivenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Index: " + str.indexOf(ch));
    }
}
