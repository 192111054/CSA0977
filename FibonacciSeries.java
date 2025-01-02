import java.util.Scanner;   

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int num1 = 0, num2 = 1, sum, i;
        for ( i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        scanner.close();
    }
}
