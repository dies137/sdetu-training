package Lab2_1;

class Account {

	@SuppressWarnings("unused")
	private long accId;
	private String accountNumber;
	private double balance;

	Account(long pId) {
		this.accId = StudentDbApp.genId();
		this.accountNumber = pId + "-Account";
		this.balance = 0;
	}

	protected void credit(double amount) {
		this.balance += amount;
		System.out.println(
				"Account " + this.accountNumber + " credited by " + amount + "\n New Balance: " + this.balance);
	}

	protected void debit(double amount) {
		this.balance -= amount;
		System.out
				.println("Account " + this.accountNumber + " debited by " + amount + "\n New Balance: " + this.balance);
	}

	private double checkBalance() {
		return this.balance;
	}

	protected void getInfo() {
		System.out.println("Account: " + accountNumber);
		System.out.println("Current Balance: " + checkBalance());
	}
}
