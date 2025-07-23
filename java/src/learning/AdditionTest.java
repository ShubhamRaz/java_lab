package learning;
import java.util.Scanner;
public class AdditionTest {
	
	public static void main(String[] args) {
		Addition a = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int x = sc.nextInt();
		System.out.print("Enter num2: ");
		int y = sc.nextInt();
		int i = a.sum(x, y);
		if(i>30)System.out.println(x+" + "+y+" = "+i);
		else {
			System.out.println("Sum must be greater than 30");
			AdditionTest c1 = new AdditionTest();
			c1.main(args);
		}
		
	}
}
