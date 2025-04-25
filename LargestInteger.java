// Program to print largest integer where cube of integer is lessthan given number
class LargestInteger {

   public static void main(String []args) {
	   // Initating last number.
	   int number = 12000;
	   // initiating start number.
	   int initialCount = 0;
	   // variable to store largest number.
	   int largestNumber = 0;
	   // initiating boolean for while loop
	   boolean runLoop = true;
	   while(runLoop) {
		   // checking cube of the number is lessthan given number
		   if(Math.pow(initialCount,3) < 12000) {
			   largestNumber = initialCount; // storing current number
			   initialCount++;
		   } else {
			   // if cube of number is exceeding terminating the loop
			   runLoop = false;
			   largestNumber = initialCount; // storing current number
		   }
	   }
	   // Displaying the largest number.
	   System.out.println("The largest integer is : "+ largestNumber);
   }
}