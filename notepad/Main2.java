public class Main2{
	public static void main(String args[]){
	  System.out.println("Enter Size of arr && Elements ");
	  int size = Integer.parseInt(args[0]);
	  int[] arr = new int[size];
	  for(int i = 0;i<size;i++){
	    arr[i] = Integer.parseInt(args[i+1]);
	  }
		for(int i = 0; i<size;i++){
		  boolean ans = checkPrime(arr[i]);
		  System.out.println(arr[i]+ " - "+ ans);
		  }
	}
	
	private static boolean checkPrime(int n){
		for(int i = 2;i<n/2;i++){
			if(n%i==0) return false;
		}
		return true;
	}
}
