package p3;

import static java.lang.Thread.*;

//1. sleep n interrupt (use ano inner class to create a thread)
public class Tester {

	public static void main(String[] args) throws Exception{
		System.out.println("Main details " + currentThread());//main,5,main
		// create a new Thread using ano inner class
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(currentThread().getName() + " strted");
				try {
					Thread.sleep(3000);
					System.out.println("cntd....");
				} catch (Exception e) {
					System.out.println(currentThread().getName() + " got error " + e);
				}
				System.out.println(currentThread().getName() + " over");

			}
		}, "test_me"); //Runnable : 1 : main
		t1.start();
		System.out.println("main waiting for child thrd");
		t1.join();
		System.out.println("child thrd over.....");
		System.out.println("main over...");

	}

}
