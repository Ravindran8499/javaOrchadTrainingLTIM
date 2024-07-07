package main.java;


import java.util.*;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber , double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = this.balance + amount;
		
	}
	
	public void withDraw(double withDrawnAmount) {
		balance = this.balance - withDrawnAmount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accNo) {
		this.accountNumber = accNo;
	}

	public void accountDetails() {
		System.out.println("Account Number : " + getAccountNumber());
		System.out.println("Remaining Balance : " + getBalance());
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account Number: ");
		String accNo = sc.nextLine();
		System.out.println("Enter balance: ");
		double balance = sc.nextDouble();
		BankAccount ravindran = new BankAccount(accNo , balance);
		
		ravindran.deposit(40000);
		ravindran.accountDetails();
		ravindran.withDraw(7000);
		ravindran.accountDetails();

		
		
		
		
		
//		ravindran.setAccountNumber(accNo);
		sc.close();
		
		

	}

}
