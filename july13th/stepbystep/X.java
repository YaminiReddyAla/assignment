package july13th.stepbystep;

public class X {
	
	public X()
	{
		System.out.println("X object created");
	}
	
	
	//we need two objects to call the function
	//x object beucase this function is non sttaic
	//Y object becuase it is input argumetn   == core java
	public void setJunk(Y obj)
	{
		System.out.println("set Junk function of class X called");
	}

}
