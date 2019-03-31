package www.walk.threadDemo;

public class ThreadDemo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyThread myThread1 = new MyThread("A");
//		MyThread myThread2 = new MyThread("B");
//		myThread1.start();
//		myThread2.start();
		Runable runable1 = new Runable("A");
		Runable runable2 = new Runable("B");
		Thread thread1 = new Thread(runable1);
		Thread thread2 = new Thread(runable2);
		thread1.start();
		thread2.start();
	}

}
