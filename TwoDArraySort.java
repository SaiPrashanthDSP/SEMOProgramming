//Write a program to sort a two-dimensional array using the following header:
import java.util.Arrays;
import java.util.Comparator;
public class TwoDArraySort {
    public static void sort(int m[][]) {
        Arrays.sort(m, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
					// Primary sort based on rows
                } else {
                    return Integer.compare(a[1], b[1]); 
					// Secondary sort based on columns
                }
            }
        });
    }
    public static void main(String[] args) {
        int[][] array = {
                {4, 2},
                {1, 7},
                {4, 5},
                {1, 2},
                {1, 1},
                {4, 1}
        };
        System.out.println("Original Array:");
        printArray(array);
        sort(array);
        System.out.println("\nSorted Array:");
        printArray(array);
    }
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
