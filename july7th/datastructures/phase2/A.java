package july7th.datastructures.phase2;

public class A {

	private int i,j;

	public A(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("equals method of A");
		A temp =(A) obj;
		if(this.i == temp.i && this.j ==temp.j)
				 return true;
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hashcode of A");
		return i;
	}
	
	
	
	
}
