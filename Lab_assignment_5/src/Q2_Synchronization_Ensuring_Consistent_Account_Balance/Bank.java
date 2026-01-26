package Q2_Synchronization_Ensuring_Consistent_Account_Balance;

class Bank implements Runnable {

	private Account account;

	public Bank(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.subtractAmount(1000);
			// Optional log to observe interleaving
			// System.out.println(Thread.currentThread().getName() + " withdrew 1000");
		}
	}
}

class Company implements Runnable {

	private Account account;

	public Company(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.addAmount(1000);
			// Optional log
			// System.out.println(Thread.currentThread().getName() + " deposited 1000");
		}
	}
}
