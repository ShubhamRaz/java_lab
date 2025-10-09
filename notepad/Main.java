public class Main{
	public static void main(String args[]){
	  
		int n = Integer.parseInt(args[0]);
		while(n>2){
		  boolean ans = checkPrime(n);
		  System.out.println(ans);
		  n--;
		  }
	}
	
	private static boolean checkPrime(int n){
		for(int i = 2;i<n/2;i++){
			if(n%i==0) return false;
		}
		return true;
	}
}
