package Day38_CustomClassContinue;

public class BankAccountObjects {
	
	public static void main(String[] args) {
		
	BankAccount account1 = new BankAccount();
		account1.AccountHolder = "Joseph Martin";
		account1.AccountNumber = 1234098494847123L;
		
		  account1.ShowBalance();	
		  account1.ShowBalance();
          
          account1.Deposit(2000);
          account1.Deposit(4000);
          
          account1.WithDraw(3000);
          account1.WithDraw(3001);  // -36
          account1.WithDraw(2000);
          
    
        
	}
	
		
		
	}
	


