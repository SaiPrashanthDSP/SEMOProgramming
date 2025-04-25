/*
program to Print the pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

*/
class Pattern_A{

   public static void main(String []args) {
	   // Iterating through rows and columns
	   for(int rows = 1;rows <=6; rows++) {
		  
		  for (int columns = 1; columns <= rows; columns++) {
			  // printing the number when condition matched.
			  System.out.print(columns+ " ");
		  }
		  
		  System.out.println();
	   }
   }
}