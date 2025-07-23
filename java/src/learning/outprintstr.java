package learning;

public class outprintstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<110;i++) {
			System.out.print("\u001B["+i+"m"+"A--> "+i+"  ");
			if(i%10==0) {
				System.out.println("\n");
			}
		}

	}
}
