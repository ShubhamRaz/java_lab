package learning;

class car{
	static void color() {
		System.out.println("Red");
	}
}
public class Practice {
	private void color() {
		System.out.println("Green");
	}

	public static void main(String[] args) {
//		car c1 = new car();
		Practice c1 = new Practice();
		c1.color();
		car.color();
	}
}
