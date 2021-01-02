package p3;

import static java.lang.Thread.*;

//1. sleep n interrupt (use ano inner class to create a thread)
public class Tester3 {

	public static void main(String[] args) throws Exception {
		System.out.println("Main details " + currentThread());// main,5,main

		// create a new Thread using ano inner class
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(currentThread().getName() + " strted");
				try {
					boolean flag = true;
					int counter = 0;
					while (flag) {
						System.out.println(currentThread().getName() + " exec " + (counter++));
						System.out.println("Press enter to continue");
						System.in.read();
						Thread.sleep(500);
						
					}
					System.out.println("cntd...." + currentThread().getName());
				} catch (Exception e) {
					System.out.println(currentThread().getName() + " got error " + e);
				}
				System.out.println(currentThread().getName() + " over");

			}
		}, "t1"); // Runnable : 1 : main
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(currentThread().getName() + " strted");
				try {
					System.out.println("t2 waiting for t1 to complete exec");
					t1.join();
					System.out.println("cntd...." + currentThread().getName());
				} catch (Exception e) {
					System.out.println(currentThread().getName() + " got error " + e);
				}
				System.out.println(currentThread().getName() + " over");

			}
		}, "t2");
		t1.start();
		t2.start();
		//send interrupt
		Thread.sleep(1000);
		System.out.println("main interrupting t1");
		t1.interrupt();//main ---> t1
		System.out.println("sent interrupt");
		t1.join();
		System.out.println("1");
		t2.join();
		System.out.println("2");
		System.out.println("child thrd over.....");
		System.out.println("main over...");

	}

}
