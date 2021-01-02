package runnable_tasks;

import static java.lang.Thread.currentThread;

import com.app.core.BankAccount;

public class UpdaterTask implements Runnable {
	private BankAccount jointAccount;

	public UpdaterTask(BankAccount jointAccount) {
		this.jointAccount =jointAccount;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted ");
		try {
			while (true) {
				// simply invoke in a loop joint a/c's update method
				jointAccount.updateBalance(500);
			Thread.sleep(43);// for forcing ctx switching....
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " error " + e);
		}
		System.out.println(currentThread().getName() + " over ");

	}

}
