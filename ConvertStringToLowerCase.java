import java.util.*;
public class ConvertStringToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = sc.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
