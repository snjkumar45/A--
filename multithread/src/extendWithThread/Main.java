package extendWithThread;

public class Main {
	public static void main(String[] args) {
		int k=0;

		int nj = 8;
		for (int i = 0; i < nj; i++) {
			A a1 = new A();
			a1.start();
			// a.run();
			System.out.println("is this real :"+k++);
		}

	}

}

class A extends Thread {
	public void run() {
		try {
			// displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception caught" + e);
		}
	}
}