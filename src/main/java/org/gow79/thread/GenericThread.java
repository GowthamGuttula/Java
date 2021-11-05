package org.gow79.thread;

public class GenericThread implements Runnable {

	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public void run() {

		//synchronized (GenericThread.class) {
				System.out.println(this.word);

				

		//}

	}

}
