/*
 * Generating BankATMException whenever 
 * withdrawal is done for balance less than 10000
 */
//creating class BankAtm

public class BankAtm extends Exception {
	String s1; 
	int atmId;
	String bankName, location;
	double balance = 10000,deposit;
	BankAtm(String s){
		s1=s;
	}
	// method to return string in case exception occurs
	  public String toString (){
		return ("BankAtam exception WE ARE SORRY "+s1);
		
	}

	// defining wihdraw method
	public void withdraw(double amt) {
		// TRY and CATCH to deal with exception
		try {
			// logic condition if amount entered is greater than balance
			if (amt > balance)
				throw new BankAtm ("BANK ATM Exception" +s1);

			// deduction of balance
			balance = balance - amt;
			System.out.println("available balance " + balance);
		}
		// catching excepton
		catch (BankAtm ex) {
			System.out.println(ex);
		}
	}

	// deposit method
	public void deposit(double amt) {
		 deposit=deposit-amt;

	}

	public static void main(String[] args) {
		// object of bankAtam class
		BankAtm obj = new BankAtm(" insufficient balance " );
		obj.withdraw(100001);
		obj.withdraw(456);
		obj.withdraw(789);
	}

}
