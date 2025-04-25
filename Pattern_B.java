/*
program to Print the pattern
i,j ---> 1 2 3 4 5 6
1        1 2 3 4 5 6
2        1 2 3 4 5
3        1 2 3 4
4        1 2 3 
5        1 2 
6        1
Value exist in pattern only when rownumber+columnnumber <=7
*/
class Pattern_B {

   public static void main(String []args) {
	   // Iterating through rows and columns.
	   for(int rows = 1;rows <=6; rows++) {
		  // checking condition based on pattern
		  for (int columns = 1; rows+columns <= 7; columns++) {
			  // Displaying the number.
			  System.out.print(columns+ " ");
		  }
		  
		  System.out.println();
	   }
   }
}