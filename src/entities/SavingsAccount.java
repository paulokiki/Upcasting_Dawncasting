
package entities;


public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(Double interestRate, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
  public void updateBalance(){
      balance += balance * interestRate;
  }  
  
    @Override
  public void withdraw(double amount){ //sobreescrever o metodo saque da classe account
      balance -= amount;
  }
    
}
