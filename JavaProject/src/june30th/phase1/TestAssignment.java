package june30th.phase1;

public class TestAssignment {
	
	public static void main(String[] args) {
	
		Device device =new Device();
		device.setDeviceId(44);
		passDevice(device);
		System.out.println(device.getDeviceId());
		
		
		
	}
	
	
	
	private static void passDevice(Device anotherDevice) {
		// TODO Auto-generated method stub
		anotherDevice.setDeviceId(57);
		
	}



	//kids assingment..
	public static void main3(String[] args) {
		
		Device device =new Device();
		device.setDeviceId(44);
		Device anotherDevice = device;
		anotherDevice.setDeviceId(55);
		System.out.println(device.getDeviceId());
		
		
		
		
	}
	
	
	public static void main2(String[] args) {
		
		int i =3;
		f1(i);
		System.out.println(i);
		
	}

	private static void f1(int j) {
		// TODO Auto-generated method stub
		j =4;
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		int i =3;
		int j =i; //assignment
		j =4;
		System.out.println(i);

	}

}
