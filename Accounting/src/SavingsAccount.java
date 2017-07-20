public class SavingsAccount extends Account
{
private  SavingsAccount oSavingsAccount;
	
   public SavingsAccount(long amount)
   {
      super("savings", amount);
   }

public SavingsAccount getSavingsAccount() {
	return oSavingsAccount;
}

public void setSavingsAccount(SavingsAccount oSavingsAccount, long amount) {
	this.oSavingsAccount = oSavingsAccount;
	this.oSavingsAccount.setAmount(amount);
}

public void DepositAmount(long Amount) {
	this.oSavingsAccount.deposit(Amount);
}
   
}