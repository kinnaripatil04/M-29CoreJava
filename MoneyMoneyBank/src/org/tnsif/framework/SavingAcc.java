package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc{
	//private field
	private boolean isSalaried;
	static final private float MINBAL = 0.0f;
	//constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	public void withdraw(float accBal) {
		System.out.println("Account No: " + this.getAccNo() + " Account Name: " + this.getAccNm() + " Account Balance: " + (this.getAccBal()+ MINBAL));
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
}
