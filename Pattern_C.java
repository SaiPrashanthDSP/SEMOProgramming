/*
program to Print the pattern
i,j ---> 6 5 4 3 2 1
1                  1
2                2 1
3              3 2 1
4            4 3 2 1
5          5 4 3 2 1
6        6 5 4 3 2 1    
Value exist only when column number lessthan row number.
*/
class Pattern_C {

   public static void main(String []args) {
	   // iterating through rows and columns
	   for(int rows = 1;rows <=6; rows++) {
		  
		  for (int columns = 6; columns >=1; columns--) {
			  // Checking condition and printing the number or space.
			  if(columns <= rows) {
				  System.out.print(" "+columns);
			  } else {
				  System.out.print("  ");
			  }
		  }
		  System.out.println();
	   }
   }
}