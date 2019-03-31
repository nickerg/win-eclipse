package www.walk.threadDemo;

import java.util.Iterator;

public class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		this.name = name;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<100;i++) {
			System.out.println(name+":"+i);
		}
	}
}
