package june30th.phase1;

public class TestConstructors {
	
	public static void main(String[] args) {
		
		Account account =new Account(23);
		account.setBalance(44);
		account.setBalance(55);
		account.setBalance(66);
		//on account object can we call constructor 2 times or 3 times.. possible
		//not possible.
		
		//setbalance call it 100 times it works becuase it is non static function
		//not a constructor.
		
		
	}
	
	public static void main3(String[] args) {
	
			Runtime r =Runtime.getRuntime();
			long  y = r.freeMemory();
			
			System.out.println(y); //to keep kids happy sysout
			
		
	}
	
	
	//code is written by person Y
	public static void main2(String[] args) {
		
		//variable creatin ok
		//what are you doing with varible nothing, ok then dont create the variable
		
		
		
		//Account account =Account.f1(); //user of the class person Y
		//System.out.println(account.getBalance()); //good
		
		
		
		
		//Integer i =new Integer();//sreaming red line why..i did astrology... 
		
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		f1();

	}

	private static void  f1() {
		// TODO Auto-generated method stub
		
	}

}
