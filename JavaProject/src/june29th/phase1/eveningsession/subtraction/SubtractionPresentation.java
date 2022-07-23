package june29th.phase1.eveningsession.subtraction;

public class SubtractionPresentation {
	
	private SubtractionService substractionService=new SubtractionService();
	

	public void start() {
		// TODO Auto-generated method stub
		
		//getting things from the user
		//dispalying messges to the user.
		
		int num1 =4; //assume i got this from the user. how
		int num2 =3; //assume i got this from user..
		int result = substractionService.subtract(num1,num2);
		//kids will be happy looking at line no 18 , why  their
		//favourite int is there..
		
		System.out.println("result is " + result);
		
		
		
	}

}
