package day44_AccessModifier;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfYusuf {
	
	public static void main(String[] args) {
		
		BankAccount Yusuf = new BankAccount();
		
		Yusuf.setAccountHolder("Yusuf demirelli");
		Yusuf.setAccountNumber(123456789L);
		
		
		System.out.println("Name: " + Yusuf.getAccountHolder());
		System.out.println("Account Number: " + Yusuf.getAccountNumber());
		System.out.println("Avaiable Balance: " + Yusuf.getAvaiableBalance());
		
		Yusuf.Deposit(2000);  //2000
		Yusuf.ShowBalance(); //2000
		Yusuf.Withdraw(2500);
		Yusuf.ShowBalance();  //535
		Yusuf.Deposit(1000);
		Yusuf.ShowBalance();  //465
		System.out.println("================================");
		
		BankAccount Nazli = new BankAccount();
		
		  Nazli.setAccountHolder("Nazli");
		  Nazli.setAccountNumber(918373490273L);
		  
		  System.out.println("Name: " + Nazli.getAccountHolder());
		  System.out.println("Account Number: " + Nazli.getAccountNumber());
		  System.out.println("Avaiable Balance: " + Nazli.getAvaiableBalance());
		  
		  BankAccount [] accounts = { Yusuf,Nazli };
		  ArrayList<BankAccount> Account = new ArrayList<>();
		  
		   //Account.add(Sarah);
          //Account.add(Serkan);
      Account.addAll(Arrays.asList(Yusuf, Nazli));
	}

}
