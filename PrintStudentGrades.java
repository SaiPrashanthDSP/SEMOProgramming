import java.util.*;
// Program to print grades of the student by their scores.
class PrintStudentGrades {
	// Function that returns grade by checking student score
	public static char studentGrade(int studentScore, int bestScore) {		
			if(studentScore >= (bestScore - 10)) return 'A';
			else if(studentScore >= (bestScore - 20))  return 'B';
			else if(studentScore >= (bestScore - 30))  return 'C';
			else if(studentScore >= (bestScore - 40)) return 'D';
			else return 'F';		
	}
	// Function to return max score from array of scores
	public static int getMaxScore(int []scores){
		int max = scores[0];
		for (int i = 0; i < scores.length; i++) {
           max = Math.max(max, scores[i]);
       }
	   return max;
	}
   public static void main(String []args) {	   
	   Scanner scanner = new Scanner(System.in); // initializing scanner
	   System.out.print("Enter the number of students: ");
	   int numberOfStudents = scanner.nextInt(); // sotring number of students
	   int marks[] = new int[numberOfStudents]; // initializing array
	   // Reading student marks
       System.out.printf("Enter %d scores: ", numberOfStudents);
	   marks[0] = scanner.nextInt();
	   marks[1] = scanner.nextInt();
	   marks[2] = scanner.nextInt();
	   marks[3] = scanner.nextInt();
	   int bestScore = getMaxScore(marks); // getting max score
	   // iterating through the scores and checking grade
       for (int i=0; i<numberOfStudents; i++) {
		    System.out.printf("Stduent %d score is %d and grade is %c \n"
			,i,marks[i],studentGrade(marks[i],bestScore)); }}}