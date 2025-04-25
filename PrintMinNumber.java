import java.util.*;
// Program to print minimum number from given numbers.
class PrintMinNumber {
	
	// Function to return min number from given array
	public static double getMinNumber(double []numbers){
		double min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
           min = Math.min(min, numbers[i]);
       }
	   return min;
	}
   public static void main(String []args) {	   
	   Scanner scanner = new Scanner(System.in); // initializing scanner
	   double numbers[] = new double[10]; // initializing array
	   // Reading numbers
       System.out.printf("Enter %d numbers: ", 10);
	   for (int i = 0; i < numbers.length; i++) {
           numbers[i] = scanner.nextDouble();
       }
	   
	   // Storing the minimum number returned.
	   double minNumber = getMinNumber(numbers); 
	   System.out.println("The minimum number is "+minNumber);
       }
}
