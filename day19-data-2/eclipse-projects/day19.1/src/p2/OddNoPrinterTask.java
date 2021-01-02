package p2;

import static java.lang.Thread.currentThread;

import java.util.Random;

public class OddNoPrinterTask implements Runnable {
	private Random random;
	private int start, end;

	public OddNoPrinterTask(int start, int end) {
		random = new Random();
		this.start = start;
		this.end = end;
	}
	// Overriding form of the method can't add any NEW checked excs

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted ");
		try {
			for (int i = start; i <= end; i++) {
				if (i % 2 != 0)
					System.out.println(currentThread().getName() + " No " + i);
				Thread.sleep(random.nextInt(500) + 1);// 1-500
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " error " + e);
		}
		System.out.println(currentThread().getName() + " over ");
	}
}
