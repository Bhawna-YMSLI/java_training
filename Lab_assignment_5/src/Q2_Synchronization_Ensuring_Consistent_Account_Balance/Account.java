package Q2_Synchronization_Ensuring_Consistent_Account_Balance;
public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Unsynchronized version (for demonstration)
    public void addAmount(double amount) {
        double temp = balance;
        temp += amount;
        balance = temp;
        // Optional log to see interleaving
        // System.out.println(Thread.currentThread().getName() + " added " + amount + ", Balance: " + balance);
    }

    public void subtractAmount(double amount) {
        double temp = balance;
        temp -= amount;
        balance = temp;
        // Optional log
        // System.out.println(Thread.currentThread().getName() + " subtracted " + amount + ", Balance: " + balance);
    }

    // Synchronized version (Method-Level)
    
//    public synchronized void addAmount(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void subtractAmount(double amount) {
//        balance -= amount;
//    }
    

    // Synchronized version (Block-Level)
//    
//    public void addAmount(double amount) {
//        synchronized (this) {
//            balance += amount;
//        }
//    }
//
//    public void subtractAmount(double amount) {
//        synchronized (this) {
//            balance -= amount;
//        }
//    }
    
}
