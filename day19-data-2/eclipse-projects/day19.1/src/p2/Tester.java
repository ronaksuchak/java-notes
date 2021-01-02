package p2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter range");
			int start = sc.nextInt();
			int end = sc.nextInt();
			Thread t1 = new Thread(new EvenNoPrinterTask(start, end), "even");
			Thread t2 = new Thread(new OddNoPrinterTask(start, end), "odd");// 1 : main : runnable
			t1.start();
			t2.start();// 3 : Runnable
			System.out.println("main waiting for child thrds to finish exec");
			System.out.println("t1 alive " + t1.isAlive() + " t2 " + t2.isAlive());// true

			t1.join();
			t2.join();

			System.out.println("child thrds over....");
			System.out.println("t1 alive " + t1.isAlive() + " t2 " + t2.isAlive());// false

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
