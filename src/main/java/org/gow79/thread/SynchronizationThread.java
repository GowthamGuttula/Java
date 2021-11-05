package org.gow79.thread;

public class SynchronizationThread {

	public static void main(String a[]) {
var testClass = new TestClass();

Thread t1 = new Thread(testClass);
Thread t2 = new Thread(testClass);

t1.start();
t2.start();
		
	}
	
	synchronized void print1() {
		System.out.println("Print 1");
	}
	
	synchronized void print2() {
		System.out.println("Print 2");
	}
	
}

class TestClass implements Runnable{

	@Override
	public void run() {
		System.out.println("In current Thread: "+Thread.currentThread().getName());
	}
	
	
	
}
