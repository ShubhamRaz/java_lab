
public class sumOfDigits {
	
	public static int sum(int num) {
		int total = 0;
		while(num>0) {
			total = total+num%10;
			num = num/10;
		}
		
		return total;
	}
	
	public static int reverse(int num) {
		int result = 0;
		while(num>0) {
			result = result*10+num%10;
			num = num%10;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1231));
		System.out.println(reverse(456123));

	}

}
