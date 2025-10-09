abstract class amrit{
	abstract void print();
	void prn() {
		System.out.println("another is caled");
	}
}
class amchild extends amrit{
	void print() {
		System.out.println("amrit child is called");
	}
	void print(int a) {
		System.out.println("amrit child is called"+a);
	}
	public void cc() {
		System.out.println("hello");
	}
}
public class inher {
	public static void main(String[] args) {
		amrit a=new amchild();
		a.print();
		
	}

}
