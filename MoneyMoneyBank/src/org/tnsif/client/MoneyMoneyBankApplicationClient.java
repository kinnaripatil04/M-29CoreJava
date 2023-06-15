//driver class
/*program to demonstrate on MoneyMoneyBank*/
package org.tnsif.client;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.application.MMBankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;
import org.tnsif.framework.BankFactory;
public class MoneyMoneyBankApplicationClient{
	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(678, "Kinnari N. Patil", 90, true);
		CurrentAcc c = new MMCurrentAcc(90, "Dr. Kajri N. Patil", 89, 90);
		System.out.println("Savings Account");
		s.withdraw(s.getAccBal());
		System.out.println("Current Account");
		c.withdraw(s.getAccBal());
		System.out.println(s);
		System.out.println(c);
		
	}
}