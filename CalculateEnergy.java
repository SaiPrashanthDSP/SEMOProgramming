import java.util.*;
/*  Java program to calculate energy needed to heat water from 
  initial temperature to final temperature.*/
class CalculateEnergy {
 public static void main(String []args) 
    {
        /* Initializing Amount of water, Initial Temparature, 
		Final Temparature and Energy Needed.*/ 
        double amountOfWater, initialTemperature, 
		finalTemperature, energyNeeded = 0.0;
              
        // Initializing scanner to take User Input.
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter amount of water in kilograms.
        System.out.print("Enter the amount of water in kilograms : ");
        // Storing the user entered amount of water in a variable.
        amountOfWater = scanner.nextDouble();

        // Prompting the user to enter initial temperature.
        System.out.print("Enter the initial temperature in degree celsius : ");
        // Storing the user entered initial temperature in a variable.
        initialTemperature = scanner.nextDouble();

        // Prompting the user to enter final temperature.
        System.out.print("Enter the final temperature in degree celsius: ");
        // Storing the user entered final temperature in a variable.
        finalTemperature = scanner.nextDouble();
   
        // Calculating the energy required to heat the water.
        energyNeeded =	amountOfWater* (finalTemperature - initialTemperature) * 4184;
        // Displaying the user, amount of energy needed in joules.
        System.out.println("The energy needed is : " + 	energyNeeded + " joules ");
   }
}