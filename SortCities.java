import java.util.*;
// program to sort entered strings.
class SortCities {
 public static void main(String []args){   
     // initializing the scanner
     Scanner scanner = new Scanner(System.in);
	 int numberOfCities = 3;
	 String cities[] = new String[numberOfCities];
	 // Prompting the user to enter first,second,third cities.
	 System.out.print("Enter the first city: ");
	 cities[0] = scanner.nextLine();
	 System.out.print("Enter the second city: ");
	 cities[1] = scanner.nextLine();
	 System.out.print("Enter the third city: ");
	 cities[2] = scanner.nextLine();
	 // Using inbuilt sort method to sort strings.
	 Arrays.sort(cities);
	 // Displaying the sorted strings.
	 System.out.print("The three cities in alphabetical order are ");
	 for(int i=0; i<numberOfCities;i++) {
		 System.out.print(" "+cities[i]);
	 }
	 
	   
   }
}