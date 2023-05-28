public class BankAccount {
	
	
	int accountNo;
	double balance;
	BankAccount(int acc, double bal)
	{
		this.accountNo = acc;
		this.balance = bal;
	}
	
	public void Deposit(double dep) {
		this.balance = this.balance + dep;
		System.out.println("Balance Successfully Deposited");
	}
	
	public String Withdraw(double wDraw) {
		if(this.balance >= wDraw) {
			this.balance = this.balance - wDraw;			
			return wDraw + " Has Been Deducted From Balance";
		}
		else {
			System.out.println("Insufficient Balance");
			return "";
		}
	}
	
	public void Transfer(BankAccount obj, double bal) {
		if(this.balance < bal)
		{
			System.out.println("Insufficient balance");
		}
		else {
			this.balance = this.balance - bal;
			obj.balance = obj.balance + bal;
			System.out.println("Successfully transferred balance to "+ obj.accountNo);
		}
	}
	
	public double Checkbal() {
		return this.balance;
	}
}