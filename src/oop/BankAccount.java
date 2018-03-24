package oop;

public class BankAccount {
	String accountNumber;
	String routingNuber;
	String name;
	String ssn;
	String accountType;
	
	BankAccount () {
		System.out.println("New account created!");
	}
	
	BankAccount (String accountType) {
		System.out.println("New account: "+ accountType);
	}
	
	void deposit() {
	}

	void withdraw() {
	}

	void checkBalance() {
	}

	void getStatus() {
	}
}
