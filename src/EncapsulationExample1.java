
public class EncapsulationExample1 {
	
	private int x; // private attributes
	private double y;


	public EncapsulationExample1(String name, int x) {
		this.x = x;
		name += " construtor bachodi";
		System.out.println("constructor of encapsulation. name = " + name);
	}
	
	public int getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	
	
}
