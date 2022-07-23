package july12th.threads;

public class NewThread extends Thread {
public NewThread() {
	setName("dthread");
	start();//step-3
}

@Override //job of thread step 2
public void run() {
	// TODO Auto-generated method stub
	A.f1();
}

}
