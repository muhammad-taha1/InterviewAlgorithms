
public class ClassToImplementAbstract1 extends AbstractExample1 {

	
	public ClassToImplementAbstract1(String name) {
		super(2);
		System.out.println("Constructor of object inheriting Abstract Example." +
				" name passed in constructor = " + name);
	}
	
	public int substract(int a ,int b) {
		System.out.println("Substract in object inheriting abstract example");
		return a-b;
	}
	
	@Override
	public int add(int a, int b) {
		System.out.println("addition from object inheriting abstract");
		return a*b;
	}
	
}
