import java.util.Scanner;

public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        
        int[] numbers = new int[10];

        // Read 10 integers
        for (int i = 0; i < 10; i++) {
            numbers[i] = num.nextInt();
        }

        // Call the eliminateDuplicates method to remove duplicates
        int[] Numbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int number : Numbers) {
            System.out.print(number + " ");
        }
        num.close();
    }

    // Method to eliminate duplicates from an array
    public static int[] eliminateDuplicates(int[] list) {
        int[] List = new int[list.length];
        int Count = 0;

        for (int number : list) {
            // Check if the number is not already in the list
            if (!contains(List, Count, number)) {
                List[Count] = number;
                Count++;
            }
        }

        int[] result = new int[Count];
        
        System.arraycopy(List, 0, result,0, Count);

        return result;
    }

    // Helper method to check if an array contains a specific number
    public static boolean contains(int[] arr, int count, int number) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
