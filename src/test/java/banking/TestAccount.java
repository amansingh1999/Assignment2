package banking;

import org.junit.jupiter.api.Test;

public class TestAccount {
	
	@Test
	public void testValidDeposit() {
		int amount1=100;
		Account account1=new Account(amount1);
		account1.deposit(amount1);
	}
	
	@Test
	public void testInValidDeposit() throws AmountException {
		int amount2=-100;
		Account account2=new Account(amount2);
		account2.deposit(amount2);
	}
	
	@Test
	public void testValidWithdraw() {
		int amount3=100;
		Account account3=new Account(1000);
		account3.withdraw(amount3);
	}
	
	@Test
	public void testInValidWithdraw() throws AmountException {
		int amount4=-12;
		Account account4=new Account();
		account4.withdraw(amount4);
	}
	
	@Test
	public void testInsufficientWithdraw() throws BalanceException {
		int amount5=5000;
		Account account5=new Account(1000);
		account5.withdraw(amount5);
	}

}
