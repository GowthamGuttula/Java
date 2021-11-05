package org.gow79.thread.producerconsumer;

public class Caller {
	 public static void main(String[] args) {
	        Drop drop = new Drop();
	        (new Thread(new Producer(drop))).start();
	        (new Thread(new Consumer(drop))).start();
	    }
}
