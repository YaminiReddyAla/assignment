package july12th.threads;

public class JobOfThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
    Thread.currentThread().setName("custom thread");
    A.f1();
	}

}
