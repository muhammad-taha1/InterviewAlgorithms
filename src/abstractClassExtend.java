
public class abstractClassExtend extends abstractClass{
	
	public abstractClassExtend() {
		// TODO Auto-generated constructor stub
	}
	
	public int calc() {
		abstractClassExtend a = new abstractClassExtend();
		System.out.println(a.moiz());
		return 0;
		
	}
	
//	@Override
//	public int moiz() {
//		return 1;
//		
//	}
	
	public static void main(String[] args) {
		abstractClassExtend a = new abstractClassExtend();
		a.calc();
	}

}
