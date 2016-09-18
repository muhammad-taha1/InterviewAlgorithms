
public abstract class AbstractExample1 implements InterfaceExample1 {
	
	public AbstractExample1(int x) {
		System.out.println("Constructor of Abstract Class. input x = " + x);
	}
	
	public int add(int a, int b) {
		System.out.println("addition of abstract class");
		return a+b;
	}
	
	//public abstract int ab();

}
