import java.util.Scanner;

public class debitAccount extends BankAccount {
  private int serviceCharge;

  public debitAccount() {
    super();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a service charge");
    serviceCharge = scan.nextInt();

  }

  public double widthdraw() {
    double balance = getBalance();
    balance =  balance - serviceCharge;
    double w = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("How much do you wish to widthdraw?");
    w = scan.nextDouble();

    if (balance - w < 0) {

      w = overdraft(w);
      System.out.println("Overdraft has been applied.");

     
    }
      super.widthdraw(w);
    
    return balance;
  }

  private double overdraft(double w) {
    w = w + 50;
    return w;
  }

  public String toString() {
    return getName() + " has a balance of " + getBalance() + " and a service charge of " + serviceCharge;
  }
}