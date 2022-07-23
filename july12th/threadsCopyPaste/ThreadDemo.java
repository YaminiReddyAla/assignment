package july12th.threadsCopyPaste;

public class ThreadDemo  extends Thread {
	   private Thread t;
	   private String threadName;
	   PrintDemo  pdd;

	   ThreadDemo( String name,  PrintDemo pd) {
	      threadName = name;
	      pdd = pd;
	   }
	   
	   public void run() {
	      synchronized(pdd) {
	         pdd.printCount();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}
