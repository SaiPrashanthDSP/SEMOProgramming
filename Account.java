import java.util.*;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
	private Date dateCreated;
	// Default Constructor
	Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	// Parameterised constructor
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	// Function to set id
	public void setId(int id) {
		this.id = id;
	}
	// Function to fetch id
	public int getId() {
		return this.id;
	}
	// Function to set balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// Function to get balance
	public double getBalance() {
		return this.balance;
	}
	// Function to set annual interest rate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	// Function to fetch annual interest rate
	public double getAnnualIntrestRate() {
		return this.annualInterestRate;
	}
	// Funcion to fetch date
	public Date getDateCreated(){
		return this.dateCreated;
	}
	// function to fetch monthlyinterestrate.
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	// Function to fetch monthly interest
	public double getMonthlyInterest(){
		return this.balance*(annualInterestRate/12);
	}
	// Function to withdraw amount
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	// Function to deposit amount
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public static void main(String []args) {
		// Account class reference
		Account account = new Account(1122, 20000);
		// setting annual interest rate
		account.setAnnualInterestRate(4.5);
		// withdraw amount
		account.withdraw(2500);
		// deposit amount
		account.deposit(3000);
		// Displaying balance, monthly interest, date created.
		System.out.println("Balance in the account is : "+ account.getBalance());
		System.out.println("Monthly interest is : "+ account.getMonthlyInterest());
	   System.out.println("Date Created  is : "+ account.getDateCreated());


	}
    //Create constructor 
    
}