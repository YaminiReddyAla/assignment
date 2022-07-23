package addingscenario;

public class TestAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Utility.displayMessage();
		
		
		
		
		
		Resource resource =new Resource();//Creating object
		Resource anotherResource=resource;
		anotherResource.setResourceDetails(2, "monitor");
		resource.setResourceDetails(4, "sensor");
		
		
		int i =3;
		
		//how many objects do i have answer is 1.
		//how many references do we have  answer is 2.
		
		
		
		
		resource.setResourceDetails(2,"monitor");
		
		
		
		

	}

}
