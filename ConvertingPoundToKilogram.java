import java.util.*;

//  Java program to convert Pounds in to kilograms.
class ConvertingPoundToKilogram {
 //declaring Pound to Kilogram conversion rate as constant.   
 private static final double POUND_TO_KILOGRAM_CONVERSION_RATE = 0.454;  
 public static void main(String []args) 
    {      
        // Initializing Variable for number of pounds and to store the converted value.
		double numberOfPounds, poundsToKilograms = 0.0;
		
        // Initializing scanner to take User Input.
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter number of pounds.
        System.out.print("Enter a number in pounds : ");
        // Storing the user entered number of pounds.
        numberOfPounds = scanner.nextDouble();
  
        // Converting pounds to kilograms using conversion rate and storing it in a variable.
        poundsToKilograms =	numberOfPounds * POUND_TO_KILOGRAM_CONVERSION_RATE;
        // Displaying the result for user entered input in pounds to kilograms.
        System.out.println(numberOfPounds + " pounds is " + poundsToKilograms + " kilograms ");
   }
}