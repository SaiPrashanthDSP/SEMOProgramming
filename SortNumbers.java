import java.util.*;
// Program to sort the given numbers.
class SortNumbers {
	
	// Function to print the given numbers in ascending order.
	public static void displaySortedNumbers( double num1, double num2, double num3) {
        // Finding the maximum element.
		double max = Math.max(num1, Math.max(num2,num3));
		// Finding the small element.
		double min = Math.min(num1,Math.min(num2,num3));
		// finding the mddle element.
		double mid = (max != num1 && min != num1) ? num1 : 
		             ((max != num2 && min != num2) ? num2 : num3);
		// Printing in ascending order.			 
		System.out.println(min+","+mid+","+max);			 
		
	}

   public static void main(String []args) {
	   // initiating scanner and reading input from user
	   Scanner scanner = new Scanner(System.in);
	   	System.out.println("Please enter numbers to sort: ");	 

	    double numberOne = scanner.nextDouble();
		double numberTwo = scanner.nextDouble();
	    double numberThree = scanner.nextDouble();
	   
	   // invoking a method to print numbers in increasing order.
	   displaySortedNumbers(numberOne,numberTwo,numberThree);
   }
}