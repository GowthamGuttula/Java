package org.gow79.thread;

public class JoinThread {

	public static void main(String a[]) throws InterruptedException {
		var hello = new GenericThread();
		var world = new GenericThread();
		hello.setWord("Hello");
		world.setWord("World");
		for (int i = 0; i < 10; i++) {			
			Thread t1 = new Thread(hello);
			t1.setName("T1");
			Thread t2 = new Thread(world);
			t2.setName("T2");

			t1.start();
			t1.join();
			t2.start();			
			t2.join();
		}

	}

}
