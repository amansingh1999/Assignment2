package banking;

public class Account {
	
	private double balance;
	
	public Account() {
		balance=0;
	}

	public Account(double amount) {
		this.balance=amount;
	}
	
	public double deposit(double amount) {
        try {
			if(amount<0)
				throw new AmountException("Invalid Amount");
			else {
				balance = balance + amount;
				System.out.println("Balance Added Successfully");
			}
		} catch (AmountException e) {
			System.out.println("Amount Entered is negative");
		}
        return balance;
    }
	
	public double withdraw(double amount) {
        try {
			if (amount < 0) 
				throw new AmountException("Invalid Amount");
			
			else if(balance<=amount)
				throw new BalanceException("The Amount is less than balance");
			else {
				balance = balance - amount;
				System.out.println("Amount withdrawn successfully");
			}
		} catch (AmountException e) {
			System.out.println("Amount Entered is negative");
		}catch (BalanceException e) {
			System.out.println("Amount Entered is greater than balance");
		}
        return balance;
    }

}
