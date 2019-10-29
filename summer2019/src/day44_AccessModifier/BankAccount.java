package day44_AccessModifier;

public class BankAccount {

	/*    WarmUp: creata a custom class for bankaccount
          The attributes/data that the class can have are: 
          AccountHolder, AccountName, AvailableBalance
          Actions the class can do are:
          deposit, withdraw, checking balance
          requiremnets:
          1. apply encapsulations
          2. user should be able to deposit, withdraw and check the balance
          2.1 if the withdrawing amount is greater than available balance, 35$ penalty fee will be charger from the account
          2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money

      */

    private String AccountHolder;
    private long AccountNumber;
    private double AvaiableBalance;
    
    //getter(read only):instead return method.
    
   public String getAccountHolder() {
    	return AccountHolder;
    }
    public long getAccountNumber() {
    	return AccountNumber;
    }
    public double getAvaiableBalance() {
    	return AvaiableBalance;
    }

  //  setter (modify): instance void method, passes a parameter.
  // parameter data ftype has to maftch instance parameter.  
    
    public void setAccountHolder(String AccountHolder) {
    	this.AccountHolder = AccountHolder;
    }
	public void setAccountNumber(long AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	
	// Actrion:
	    //Deposit:
	
	public void Deposit(double amount) {
		AvaiableBalance += amount;
	}
	//Wtihdraw:
	
	public void Withdraw (double amount) {
		if(AvaiableBalance <= 0) {
			System.out.println("your account balance is less or equal 0");
			return;
		}
		
		if(amount > AvaiableBalance ) {
			AvaiableBalance -= 35;
		}
		AvaiableBalance -= amount;
	}
	
	// checkin balance:
	
	public void ShowBalance() {
		System.out.println("Avaiable Balance: " + AvaiableBalance);
	}
	
	// get account imfo:
	
	public void getAccountInfo() {
		System.out.println("Name: " );
		System.out.println("Account Number: " );
		System.out.println("Avaiable Balance: ");
	}
}
