package com.walk.refoDemo;
/**
 * 接口的使用
 * 定义一个接口，
 * 两个类实现接口
 * 
 * @author mine
 *
 */
interface USB{
	void start();
	void stop();
}

class Computer{
	public static void work(USB u) {
		u.start();
		System.out.println("工作中");
		u.stop();
	}
}

class USBDisk implements USB{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("U盘开始工作");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("U盘停止工作");
	}
}

class Printer implements USB{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("打印机开始工作");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("打印机停止工作");
	}
}
public class InterDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer.work(new USBDisk());
		Computer.work(new Printer());
	}

}
