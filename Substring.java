import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending index: ");
        int end = sc.nextInt();
        System.out.println("Substring: " + str.substring(start, end));
    }
}
