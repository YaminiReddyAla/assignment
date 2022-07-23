package associationExample;

public class Laptop {

	private int verion;

	private String about;
	private Keyboard keyboard;
	private Mouse mouse;
	
	public int getVerion() {
		return verion;
	}
	public String getAbout() {
		return about;
	}
	public Laptop(int verion, String about) {
		super();
		this.verion = verion;
		this.about = about;
	}
	public Laptop( Keyboard keyboard) {
		mouse=new Mouse();
		this.keyboard=keyboard;
	}
	public void type() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	public void learn() {
		// TODO Auto-generated method stub
		
	}
}
