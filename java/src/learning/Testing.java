package learning;
import java.util.Random;
public class Testing {
	
	private static final String RESET = "\u001B[0m"; 
	private static final String RED = "\u001B[31m"; 
	private static final String GREEN = "\u001B[32m"; 
	private static final String YELLO = "\u001B[33m"; 
	private static final String BLUE = "\u001B[34m"; 
	private static final String VOILET = "\u001B[35m";
	private static final String SKY = "\u001B[36m";
	

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// TODO Auto-generated method stub
		System.out.println(RED+"Hello"+GREEN+"Hello"+YELLO+"HELLO");
		String a = "\u001B[36m";
		System.out.println(a+"hello"+RESET+"");
		

	}

}
