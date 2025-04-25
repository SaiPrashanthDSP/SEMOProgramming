import java.util.*;
class Employee {
	String employeeName;	
	double hoursWorked,payRate,grossPay;
	double federalTax, stateTax;
	// method to calculate grossPay of employee
	public double calculateGrossPay() {
		return this.payRate*this.hoursWorked;
	}
	// method to calculate federalWithholding
	public double calculateFederalWithHolding() {
		return this.federalTax * this.grossPay;
	}
	// method to calculate stateWithholding
	public double calculateStateWithHolding() {
		return this.stateTax * this.grossPay;
	}
}
//  Java program to calculate and display employee data.
class EmployeeData {
 public static void main(String []args) 
    {    
	   // Creating reference for employee class.    
        Employee employee = new Employee();	
       // Initializing scanner to take User Input.
       Scanner scanner = new Scanner(System.in);
       // Prompting the user to enter employee name.
       System.out.print("Enter employee's name : ");
       employee.employeeName = scanner.nextLine();
       // Prompting the user to enter number of hours worked.
       System.out.print("Enter number of hours worked in a week : ");
       employee.hoursWorked = scanner.nextDouble();
       // Prompting the user to enter hourly pay rate.
       System.out.print("Enter hourly pay rate : $");
       employee.payRate = scanner.nextDouble();   
       // Prompting the user to enter federal tax rate.
       System.out.print("Enter federal tax withholding rate : ");
       employee.federalTax = scanner.nextDouble();	   
	   // Prompting the user to enter state tax rate.
       System.out.print("Enter state tax withholding rate : ");
       employee.stateTax = scanner.nextDouble();
	   employee.grossPay = employee.calculateGrossPay();
	   // storing federalWithholding, stateWithholding, totalDeduction
	   double federalWithholding = employee.calculateFederalWithHolding();
	   double stateWithholding = employee.calculateStateWithHolding();
	   double totalDeduction = (federalWithholding+stateWithholding);
	   double netPay = employee.grossPay - totalDeduction;
	   // display federalWithholding, stateWithholding, totalDeduction
	   System.out.println("Employee Name: " + employee.employeeName);
	   System.out.printf("Hours Worked: %.2f \n", employee.hoursWorked);
	   System.out.printf("Pay Rate: %.2f \n", employee.payRate);
	   System.out.printf("Gross Pay: %.2f \n", employee.grossPay);
	   System.out.println("Deductions: ");
       System.out.printf("\tFederal Withholding: $%.2f \n", federalWithholding);
	   System.out.printf("\tState Withholding: $%.2f \n",stateWithholding);
   	   System.out.printf("\tTotal Deduction: $%.2f \n",totalDeduction);
	   System.out.printf("Net Pay: $%.2f", netPay);
   }
}