package kasus1;

public class AsyncRun implements Runnable{
	@Override
	public void run() {
		try {
			System.out.println("AsynRun.run on thread " + 
					Thread.currentThread().getId());
			throw new ArithmeticException();
		}
		catch(Exception ex) {
			System.out.println("AsyncRun handled");
		}
		
	}
}


