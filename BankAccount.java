public class BankAccount {
  
private String accountHolder;
private double balance;
  
public BankAccount(String accountHolder, double balance) {
this.accountHolder = accountHolder;
this.balance = balance;
}
  
public void deposit(double amount) {
// TODO: add the amount to the balance
}
  
public boolean withdraw(double amount) {
balance -= (amount + 2.0);
return true;
}
  
public String getAccountSummary() {
return accountHolder + ": $" + balance;
}
  
}

