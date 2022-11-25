import java.util.Scanner;

public class savingsAccount extends BankAccount {
  private double interestRate;

  public savingsAccount() {
    super();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an interest rate in percentage. (Ex: 5 not 0.05 for 5%.");
    interestRate = scan.nextDouble();
  }

  public void addInterest() {
    double balance = getBalance();
    double intpercent = interestRate / 100;

    balance = (balance * intpercent);
    deposit(balance);
  }

  public String toString() {
    return getName() + " has a balance of " + getBalance() + " with an interest rate of " + interestRate + "%";
  }
}