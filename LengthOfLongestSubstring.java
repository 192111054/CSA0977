import java.util.HashSet;
import java.util.Scanner;
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Length of longest unique substring: " + findLongestUniqueSubstring(input));
        scanner.close();
    }
    public static int findLongestUniqueSubstring(String s) {
        int maxLen = 0, start = 0;
        HashSet<Character> set = new HashSet<>();
        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(end));
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
