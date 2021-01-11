package implementsRunnable;

public class Main {
	public static void main(String[] args) {
		
		int nj=10;
		for(int i=0;i>nj;i++) {
			Thread object = new Thread(new Runnable()

			{

				@Override
				public void run() {
					try {
						System.out.println("Thread " + Thread.currentThread().getId() + " Running");

					} catch (Exception e) {
						System.out.println(e + "excpetion caught");
					}

				}
			});
			
		
		object.start();
		}
	}

}
