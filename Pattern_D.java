/*
program to Print the pattern
i,j---> 1 2 3 4 5 6
0       1 2 3 4 5 6
1         1 2 3 4 5
2           1 2 3 4
3             1 2 3
4               1 2
5                 1		
Value exist in pattern when row number< column number				  

*/
class Pattern_D {

   public static void main(String []args) {
	   // iterating through rows and columns
	   for(int rows = 0 ; rows < 6; rows++) {
		  
		  for (int columns = 1; columns<=6; columns++ ) {
			  // Checking condition and calculating number to print
			  if(columns>rows) {
				  System.out.print(columns-rows+" ");
			  } else {
				  System.out.print("  ");
			  }
		  }
		  
		  System.out.println();
	   }
   }
}