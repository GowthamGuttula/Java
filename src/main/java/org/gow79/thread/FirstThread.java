package org.gow79.thread;

public class FirstThread {
	
	public static void main(String args[]) {
		Runnable r = ()->{
			for(int i=0;i<10;i++) {
				System.out.println("R "+i);
			}
		};
		
		Runnable r1 = ()->{
			for(int i=0;i<10;i++) {
				System.out.println("R1 "+i);
			}
		};
		
	Thread t = new Thread(r);
	Thread t1 = new Thread(r1);
	
	t.start();
	t1.start();
	
	}

}
