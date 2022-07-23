package july12th.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExamples {
	public static void main(String[] args) {
		Printer hpprinter=new Printer();
		ExecutorService executorservice=Executors.newCachedThreadPool();
		Runnable job1=new Cjob("word",hpprinter);
		Runnable job2=new Cjob("excel",hpprinter);
		executorservice.submit(job1);
		executorservice.submit(job2);
		executorservice.shutdown();
	}
	public static void main3(String[] args) {
		
Printer hpprinter=new Printer();
	hpprinter.print(null);
	
	}
public static void main2(String[] args) {
	//old style
	//Thread t=new NewThread();
	new Thread(()->A.f1()).start();
	
	
	ExecutorService executors=Executors.newCachedThreadPool(); 
	Runnable job1= new JobOfThread();
	executors.submit(job1);
			A.f1();
}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
    A.f1();
	}

}
