package iiit.oop.cons;

public class PracticeCopyConstructor {
	private String a;
	//default constructor
	public PracticeCopyConstructor() {
		// TODO Auto-generated constructor stub
	}
	//copy constructor
	public PracticeCopyConstructor(PracticeCopyConstructor b) {
		// TODO Auto-generated constructor stub
		this.a = b.a;
	}
	//source -> generate to string -> select field -> finish
	@Override
	public String toString() {
		return "PracticeCopyConstructor [a=" + a + "]";
	}
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	
	
}
