package learning;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Enter Your favourate number: ");
			int num = sc.nextInt();
			switch(num) {
				case 1-> System.out.println("\u001B[42mYou are Stupid\u001B[0m");
				case 2,3 -> System.out.println("\u001B[31mYou are Duffer\u001B[0m");
				case 4,5,6 -> System.out.println("\u001B[35mNon sense\u001B[0m");
				case 7 -> System.out.println("\u001B[33mThala For a reason\u001B[0m");
				
				default -> System.out.println("\u001B[34mYou are greate\u001B[0m");
		
			}
		}
		
	}

}
