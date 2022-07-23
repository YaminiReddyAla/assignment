package july7th.datastructures.phase3finalphase;

public class TestDatastructures {
	
	public static void main(String[] args) {
		
		  long y = System.currentTimeMillis();

		AnotherInterface ai =new WithoutLamda() ;//create an object whose class that implements the another interface 
		
				f3(ai);
				long z = System.currentTimeMillis();
				System.out.println(z-y);
		
		
		
		 
//		f3(()->{System.out.println("with lamda");});
		
		
	}
	
	
	private static void f3(AnotherInterface ai) {
		// TODO Auto-generated method stub
		ai.work();
		
	}


	public static void main2(String[] args) {
		
			f1(()->{System.out.println("job1 by some class");});
			
			// you are creating a class which implements that interface and you are telling
			//what function should do.., passing that object as input argument to the function.
			
			
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		SomeInterface x=new A();
		f1(x);
		
		

	}

	private static void f1(SomeInterface x) {
		// TODO Auto-generated method stub
		x.job();
	}

}
