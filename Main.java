import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount();
    debitAccount d1 = new debitAccount();
    savingsAccount s1 = new savingsAccount();
    b1.deposit();
    d1.deposit();
    s1.deposit();

    b1.widthdraw();
    d1.widthdraw();
    s1.widthdraw();

    System.out.println(b1);
    System.out.println(d1);
    System.out.println(s1);

    calcMonths(); // Calculate the # of months it takes to reach a certain balance using a savings account.    
  }

  public static void calcMonths(){
    savingsAccount s2 = new savingsAccount();
    double target = 0;
    int months = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a target ammount.");
    target = scan.nextDouble();
    while(s2.getBalance() < target){
      s2.addInterest();
      months++;
    }
    System.out.println("It took " + months + " months for you to reach " + "$" + target);
  }
}