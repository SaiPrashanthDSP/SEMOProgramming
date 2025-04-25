import java.util.*;
// Program to check given number is palindrome or not.
class CheckPalindrome {
// Function to check given number is palindrome or not.
 public static String isgivenNumberPalindrome(int number) {
	 int givenNumber = number; // Storing user input	 
	 int reversedNumber = 0; // initializing reverse number
	 while(givenNumber != 0) {
		int remainder = givenNumber%10;
		// multilplying reversedNumber with 10 and adding remainder.
		 reversedNumber = (reversedNumber*10) + remainder;
		 // updating user input after dividing by 10 for each iteration.
		 givenNumber = givenNumber/10;	}
	 if(number == reversedNumber) {
		return number +" is a palindrome."; // returns a string.
		} else {
		return number+" is not a palindrome.";
		} }
 // User input will be validated and proceeded further.
 public static void readAndValidateInput(String inputText) {
		boolean userInputValid = false; int userInput = 0;
		Scanner scanner = new Scanner(System.in); // initializing scanner
		System.out.print("enter a three digit number :");
        // loop will be iterated until the input is valid.	    
		do {
			 try {
			    userInput = scanner.nextInt();// taking user input
			    userInputValid = true;	// making input valid if no errors
				System.out.print(CheckPalindrome.isgivenNumberPalindrome(userInput));
		        } catch( Exception e) {
			       scanner.next();
			       System.out.print("Invalid number. "+inputText);}
		} while (userInputValid == false); scanner.close();} 
 public static void main(String []args) {  
 // Calling function validates input and sends to is givenNumberPalindrome() function
  CheckPalindrome.readAndValidateInput("enter a three digit number :");}}