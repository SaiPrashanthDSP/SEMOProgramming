import java.util.*;
// Program to calculate and print sum of digits in a number.
class CalculateSum {
	
	// Function to calculate sum of digits of number
	public static int sumDigits(long n) {
		long number = n;
	   int sum = 0;
	   // Iterating till number is greater than zero.
	   while(number > 0) {
		   // Taking remainder and calculating sum.
		   int remainder = (int)(number%10);
		   sum += remainder;
		   number/=10;
	   }
	   // returning sum
	   return sum;
	}

   public static void main(String []args) {
	   // initiating scanner and reading input from user
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Enter the integer: ");
	   long number = scanner.nextLong();
	   
	   // Calculating and printing sum of digits of user entered number.
	   System.out.println("Sum of the digits is : "+ sumDigits(number));
   }
}