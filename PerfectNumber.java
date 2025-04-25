// Function to Print perfect number in certain range.
class PerfectNumber {
	
	// Function returns a boolean after checking the number.
    public boolean isPerfectNumber(int number) {
		int sum = 0;
		 for (int i=1;i< number;i++) {
			 
			 if(number %i ==0) {
				 // Divisor which is perfectly dividing dividend will be summed up
				 sum = sum+i;
			 }
		 }
		return sum == number ;
	}
   public static void main(String []args) {
	   // Creating reference for Perfect Number class.
	   PerfectNumber perfectNumber = new PerfectNumber();
	   // Initating last number.
	   int number = 10000;
	   // initiating start number.
	   int initialCount = 1; 
	   while(initialCount <=number ) {
		   // Function will be called using reference for each and every iteration.
		   if(perfectNumber.isPerfectNumber(initialCount)) {
			          // Displaying perfect number.
			   		   System.out.println(initialCount);
		   }
		   initialCount++;// incrementing count.
	   }
	}
}