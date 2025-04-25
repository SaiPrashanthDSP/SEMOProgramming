// Program to print first 100 pentagonal numbers.
class PrintPentagonalNumbers {
	
	// Function to calculate pentagonal number for given number using formula.
	public static int getPentagonalNumber(int n) {
		return (n*(3*n - 1))/2;
	}

   public static void main(String []args) {
	   
	   // Iterating through first 100 numbers
	   for (int i=1 ; i<=100 ; i++) {
		   // Calculating and printing the pentagonal number for each iteration
		   System.out.printf("%7d",getPentagonalNumber(i));
		   
		   // After every 10 elements in a line printing the numbers in new line
		   if(i%10 == 0) {
			   System.out.println();
		   }
	   }
   }
}