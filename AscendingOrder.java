import java.util.Arrays;
public class AscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 6};
        Arrays.sort(numbers);
        System.out.println("Array in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
} 
