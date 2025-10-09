import java.util.Scanner;
public class printError{
  static int a = 20;
  static Scanner sc = new Scanner(System.in);
  static int b;
  public static void errFirst(){
    try{
       int b = sc.nextInt();
      int c = a/b;
      System.out.println(c);
    }
    
    catch(java.lang.ArithmeticException e){
      System.out.println(e);
      
      
    }
  }
  public static void errSecond(){
    try{
      int b = sc.nextInt();
      int c = a/b;
      System.out.println(c);
    }
    
    catch(java.util.InputMismatchException e){
      System.out.println(e);
      
      
    }
  }
  public static void errThird(){
    try{
      int b = sc.nextInt();
      int arr[] = new int[2];
      System.out.println(arr[b]);
    }
    
    catch(java.lang.ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
  }
  public static void main(String args[]){
    errFirst();
    errSecond();
    errThird();
    
  
  }
}
