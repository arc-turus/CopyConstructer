package iiit.oop.cons;

public class CopyConstructorDriverClass {
	public static void main (String[] args) {
		PracticeCopyConstructor cons = new PracticeCopyConstructor();
		cons.setA("Swati");
		//System.out.println(cons.getA());
		//cons.toString();
		PracticeCopyConstructor cons2 = new PracticeCopyConstructor(cons);
		System.out.println(cons2.toString());
	}
}
