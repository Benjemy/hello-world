package banking;

public class SavingsAccount extends Account {
	private double interesRate;
	public SavingsAccount(double balance,double interest_rate){
		super(balance);
		interesRate=interest_rate;
	}
}
