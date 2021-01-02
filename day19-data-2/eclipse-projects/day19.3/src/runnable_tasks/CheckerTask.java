package runnable_tasks;

import static java.lang.Thread.currentThread;

import com.app.core.BankAccount;

public class CheckerTask implements Runnable {
	private BankAccount jointAccount;

	public CheckerTask(BankAccount jointAccount) {
		this.jointAccount =jointAccount;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted ");
		try {
			while (true) {
				// simply invoke in a loop joint a/c's check balance  method
				
				double balance = jointAccount.checkBalance();
				if(balance != 5000) {
					System.out.println("ERROR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.exit(1);
				}
				Thread.sleep(29);// for forcing ctx switching....
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " error " + e);
		}
		System.out.println(currentThread().getName() + " over ");

	}

}
