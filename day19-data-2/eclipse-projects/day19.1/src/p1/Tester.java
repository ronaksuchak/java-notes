package p1;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread());//main thrd's dtls : main , 5 , main : 1 
		//create child thrds n confirm asynch behaviour : via implements Runnable
		RunnableTask task=new RunnableTask();//runnable task instance : 1 : main
		Thread t1=new Thread(task, "one");
		Thread t2=new Thread(task, "two");
		Thread t3=new Thread(task, "three");
		Thread t4=new Thread(task, "four");// 1
		t1.start();t2.start();t3.start();t4.start();// Runnable : 1 + 4 =5
		System.out.println("main waiting for child thrds to finish exec");
		System.out.println("t1 alive "+t1.isAlive()+" t4 "+t4.isAlive());//true
//		t3.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		System.out.println("child thrds over....");
		System.out.println("t1 alive "+t1.isAlive()+" t4 "+t4.isAlive());//false
	//	t1.start();
		System.out.println("main over....");
		

	}

}
