class BankAccount {
	private static int counter = 0;
	private int id;
	private  double balance = 0;
	private double interestRate = 0.02;

	public BankAccount(){
		counter++;
		this.id = counter;
	}

	public void setInterestRate(int interestRateInput){
		this.interestRate = interestRateInput;
	}
	public double getInterest (int yearsInput){
		return balance * this.interestRate * yearsInput;
	}
	public void setDeposit(int id, double amount){
		this.balance += amount;
	}

	public int getId(){
		return this.id;
	}

}
