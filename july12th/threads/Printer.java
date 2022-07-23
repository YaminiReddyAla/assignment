package july12th.threads;

public class Printer {

	public void print(String whattoprint) {
		// TODO Auto-generated method stub
		System.out.println("started printing"+whattoprint);
		loadingPaper();
		System.out.println("doing printing"+whattoprint);
		System.out.println("ending printing"+whattoprint);
	}

	private void loadingPaper() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
