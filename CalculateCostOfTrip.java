import java.util.*;

//  Java program to calculate the total cost of trip.
class CalculateCostOfTrip {
 public static void main(String []args) 
    {
       /* Initializing Total Distance, miles per gallon, price per 
	      gallon and Total cost for trip.*/ 
       double drivingDistance, milesPerGallon, 
	   pricePerGallon, totalCostForTrip = 0.0;
              
       // Initializing scanner to take User Input.
       Scanner scanner = new Scanner(System.in);

       // Prompting the user to enter driving distance in miles.
       System.out.print("Enter the driving distance in miles : ");
       // Storing the user entered driving distance.
       drivingDistance = scanner.nextDouble();

       // Prompting the user to enter number of miles per gallon.
       System.out.print("Enter miles per gallon : ");
       // Storing the user entered number of miles per gallon.
       milesPerGallon = scanner.nextDouble();

       // Prompting the user to enter price per gallon.
       System.out.print("Enter miles per gallon : ");
       // Storing the user entered price per gallon.
       pricePerGallon = scanner.nextDouble();
   
       // Calculating the total cost of trip and storing it in variable.
       totalCostForTrip =(drivingDistance/milesPerGallon)*pricePerGallon;
       // Displaying the user, total cost of trip for distance travelling.
       System.out.printf("The cost of driving is $%.2f", totalCostForTrip);
   }
}