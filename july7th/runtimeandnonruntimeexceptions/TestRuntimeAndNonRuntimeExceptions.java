package july7th.runtimeandnonruntimeexceptions;


/*
 * Exception exception = new DeviceNotFoundException();
		RuntimeException runtimeException =new IllegalDeviceException();//unchecked
 * 
 */


public class TestRuntimeAndNonRuntimeExceptions {
	
	public static void main(String[] args) {
		
		/*
		 * try { System.out.println("repeated stupdity"); }
		 * catch(DeviceNotFoundException dnf) {
		 * 
		 * }
		 */
		/*
		 * if(args.length == 2) throw new DeviceNotFoundException();
		 */
	}
	
	public static void main2(String[] args) {
		
		  try
		  {
			//flavour of stupidity
			  System.out.println("hello");
			  System.out.println("hi");
			  System.out.println("flavour of stupidity");
			  
			  
		  }catch(IllegalDeviceException e)
		  {
			  System.out.println("better be safe than sorry")  ;//I am lazy to collect data so i will do astrology
		  }
		
		
		
			if(args.length == 0)
				throw new IllegalDeviceException();
		
		
	}
	
	
	
	
	
	

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		//compiler is executing the else part
	/*
		else
	{
		System.out.println("hello");
	}
	*/

	}

}
