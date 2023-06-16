package org.tnsif.client;

import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.application.MMBankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;
import org.tnsif.framework.BankFactory;
public class MoneyMoneyBankApplicationClient{
	public static void main(String[] args) {
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(1,"Kinnari",7000,true);
		CurrentAcc n=new MMCurrentAcc(2,"Kajri",98000,1000);
		
		System.out.println("Saving Account");
		p.withdraw(4000);
		System.out.println("Current Account");
		n.withdraw(400);
		
		System.out.println(p);
		System.out.println(n);
		
	}
}