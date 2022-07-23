package july12th.threads;

public class Cjob implements Runnable {
	 private String whatToPrint;
	    private Printer printer;
	    
	public Cjob(String whatToPrint, Printer printer) {
			super();
			this.whatToPrint = whatToPrint;
			this.printer = printer;
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
    
    synchronized(printer) {
    	printer.print(whatToPrint);
    }
	}

}
