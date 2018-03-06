
  

public class BankAccount {
    private double balance;
    //1
    public BankAccount(){
        balance = 0.0;
    }
    //2
    public BankAccount(double pbalance){
        balance = pbalance;
    }//3
    public void setBalance(double pbalance){
        balance = pbalance;
    }//4
    public double getBalance(){
        return balance;
    }//5
    public void deposit(double pamount){
        balance += pamount;
    }//6
    public void withdraw(double pamount){
        balance -= pamount;
    }//7   
    public void calcInterest(double interest){
        balance += balance * (interest/100);
    }
}
