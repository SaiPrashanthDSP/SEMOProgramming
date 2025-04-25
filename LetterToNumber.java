import java.util.*;
class LetterToNumber {
	public static void main(String []args) {
		// initialising scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a letter: ");// prompting user to enter letter.
		String userEnteredLetter = scanner.nextLine();
		// converting user input to lower case
		String userEnteredLetterConverted = userEnteredLetter.toLowerCase();
		// checking the case and printing the corresponding number
		switch(userEnteredLetterConverted) {
			case "a": case "b": case "c": 
			System.out.println("The corresponding number is "+2);
			break;
			case "d":case "e":case "f": 
			System.out.println("The corresponding number is "+3);
			break;
			case "g":case "h":case "i": 
			System.out.println("The corresponding number is "+4);
			break;
			case "j":case "k":case "l": 
			System.out.println("The corresponding number is "+5);
			break;
			case "m":case "n":case "o": 
			System.out.println("The corresponding number is "+6);
			break;
			case "p":case "q":case "r": case "s":
			System.out.println("The corresponding number is "+7);
			break;
			case "t":case "u":case "v":
			System.out.println("The corresponding number is "+8);
			break;
			case "w":case "x":case "y": case "z":
			System.out.println("The corresponding number is "+9);
			break;
			default: System.out.println(userEnteredLetter+" is an invalid input");
		}	}}