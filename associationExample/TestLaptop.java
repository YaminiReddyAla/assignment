package associationExample;

public class TestLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Keyboard keyboard=new Keyboard("Acer");
		Laptop laptop=new Laptop(keyboard);
		laptop.type();
		laptop.learn();
	}

}
