package PastWork;

public class BankAccount {
    public static void main(String[] args) {
    Bank ram = new Bank();
    ram.deposit(500);
    ram.deposit(600);
    ram.withdraw(100);
        System.out.println(ram.getBalance());
    }
}

class Bank{
    private double balance =0;

    public double getBalance() {
        return balance;
    }

    void deposit(double amount){
        balance = balance + amount;
    }
    boolean withdraw(double amount){
        if(amount<= balance){
            balance = balance - amount;
            return true;
        }else{
           return false;
        }
    }

}
