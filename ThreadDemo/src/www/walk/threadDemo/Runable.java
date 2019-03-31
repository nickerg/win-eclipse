package www.walk.threadDemo;

public class Runable implements Runnable{
	private String name;
	public Runable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println(name+":"+i);
		}
	}
}
