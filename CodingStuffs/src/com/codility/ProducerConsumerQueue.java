package com.codility;
class ProducerConsumerQueue {
	public static void main(String[] args) {
		SharedQueue c = new SharedQueue();
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		p1.start();
		c1.start();
	}
}

class SharedQueue {
	private int contents;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}

class Consumer extends Thread {
	private SharedQueue queue;
	private int number;

	public Consumer(SharedQueue c, int number) {
		queue = c;
		this.number = number;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = queue.get();
			System.out.println("Consumer #" + this.number + " got: " + value);
		}
	}
}

class Producer extends Thread {
	private SharedQueue queue;
	private int number;

	public Producer(SharedQueue c, int number) {
		queue = c;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			queue.put(i);
			System.out.println("Producer #" + this.number + " put: " + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}
