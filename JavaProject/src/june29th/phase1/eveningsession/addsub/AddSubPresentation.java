package june29th.phase1.eveningsession.addsub;

public class AddSubPresentation {
	
	private AddSubService addSubService=
			new AddSubService();

	public void init() {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 =4;
		Result result= addSubService.addMinus(num1,num2);
		System.out.println("Addiition is "  + result.getAdding()
		+   " subtraction is " + result.getSubtract());
		
	}

}
