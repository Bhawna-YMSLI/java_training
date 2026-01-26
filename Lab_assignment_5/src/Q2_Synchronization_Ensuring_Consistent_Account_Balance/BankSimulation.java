package Q2_Synchronization_Ensuring_Consistent_Account_Balance;

public class BankSimulation {

	public static void main(String[] args) {

		Account account = new Account(10000); // initial balance ₹10,000

		Bank bank = new Bank(account);
		Company company = new Company(account);

		Thread bankThread = new Thread(bank, "BankThread");
		Thread companyThread = new Thread(company, "CompanyThread");

		bankThread.start();
		companyThread.start();

		try {
			bankThread.join();
			companyThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final Balance: " + account.getBalance());
	}
}
