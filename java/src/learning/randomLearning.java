package learning;
import java.util.Random;
public class randomLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for(int i = 0; i<20;i++) {
			System.out.print(random.nextInt(4)+1);
		}
		
		System.out.println();
		
		for(int i = 0; i<20;i++) {
			float a = (float)Math.random();
			System.out.print(a+" ");
		}
	}

}
