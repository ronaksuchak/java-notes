package p1;

import static java.lang.Thread.currentThread;

import java.util.Random;

public class RunnableTask implements Runnable {
	private Random random;

	public RunnableTask() {
		random = new Random();
	}
	// Overriding form of the method can't add any NEW checked excs

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted ");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(currentThread().getName() + " exec counter #" + i);
				Thread.sleep(random.nextInt(500) + 1);// 1-500
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " error " + e);
		}
		System.out.println(currentThread().getName() + " over ");
	}
}
