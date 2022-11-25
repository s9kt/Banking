import java.util.Scanner;

public class BankAccount {
  private double balance;
  private String name;

  public BankAccount(double amount, String username) {
    balance = amount;
    name = username;
  }

  public BankAccount(String username) {
    balance = 0;
    name = username;
  }

  public double deposit(double d) {
    balance = balance + d;
    return balance;
  }

  public double widthdraw(double w) {
    if (balance - w < 0) {
      balance = balance - w;
      System.out.println(name + " has insufficient funds.");
    } else {
      balance = balance - w;
    }
    return balance;
  }

  public double getBalance() {
    return balance;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return name + "'s account has a balance of $" + balance;
  }

  public BankAccount() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a name.");
    name = scan.nextLine();
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter an account balance.");
    balance = scan1.nextInt();
  }

  public double deposit() {
    Scanner scan = new Scanner(System.in);
    System.out.println("How much would you like to deposit to " + name + "?");
    balance += scan.nextDouble();
    return balance;
  }

  public double widthdraw() {
    Scanner scan = new Scanner(System.in);
    System.out.println("How much would you like to widthdraw from " + name + "?");
    double w = scan.nextDouble();
    if (balance - w < 0) {
      balance = balance - w;
      System.out.println(name + " has insufficient funds.");
    } else {
      balance = balance - w;
    }
    return balance;
  }
}