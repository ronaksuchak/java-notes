package tester;

import com.app.core.BankAccount;

import runnable_tasks.CheckerTask;
import runnable_tasks.UpdaterTask;

public class TestSharedResources {

	public static void main(String[] args) throws InterruptedException {
		// create single copy of joint a/c
		BankAccount acct = new BankAccount(5000);
		// create tasks , attach thrd n strt
		Thread t1 = new Thread(new UpdaterTask(acct), "t1");
		Thread t2 = new Thread(new CheckerTask(acct), "t2");
		t1.start();
		t2.start();
		System.out.println("Main Waiting for thrds to complete exec");
		t1.join();
		t2.join();
		System.out.println("Main over....");

	}

}
