package july7th.runtimeandnonruntimeexceptions;

public class TestRuntimeAndNonRuntimeEXceptionsAnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personACode();
		
		

	}

	private static void personACode() {
		// TODO Auto-generated method stub
		System.out.println("peron A coDe");
		
		try
		{
		personBCode();
		}catch(IllegalDeviceException e)
		{
			
		}
		
	}

	private static void personBCode() {
		// TODO Auto-generated method stub
		System.out.println("peron B coDe");
		personCCode();
		
		
	}

	private static void personCCode() throws IllegalDeviceException{
		// TODO Auto-generated method stub
		System.out.println("peron CcoDe");
		// some code changes results in DeviceNotFoundException he decides to use throws.. why
		//he does not know context
	//	throw new IllegalDeviceException()
		
	}

}
