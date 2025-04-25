import java.util.*;
class CheckBetterPackage{
 public static void main( String []args) {
	 // initializing scanner class
	 Scanner scanner = new Scanner(System.in);
	 // Prompting user to enter weight and price of package
	 System.out.print("Enter weight and price of each package 1 :");
	 double weight1 = scanner.nextDouble();// storing weight of pack1
	 double price1 = scanner.nextDouble();// storing price of pack1
	 
	 // Prompting user to enter weight and price of package2
	 System.out.print("Enter weight and price of each package 2 :");
	 double weight2 = scanner.nextDouble();// storing weight of pack2
	 double price2 = scanner.nextDouble();// storing weight of pack1
	 
	 // Checking the which is better package and displaying.
	 if((price1/weight1) == (price2/weight2)) {
		 System.out.println("Both packages has a better price.");
	 } else if ((price1/weight1) < (price2/weight2)){
		 System.out.println("Package 1 has a better price.");
	 } else {
		 System.out.println("Package 2 has a better price.");
	 }
 }
}