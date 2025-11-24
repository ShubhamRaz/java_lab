abstract class testA{
  abstract void method1();
}

abstract class testB extends testA{
  abstract void method2();
}

class testC extends testB{
  void method1(){
    System.out.println("method1 called -- testA");
  }
  
  void method2(){
    System.out.println("method2 called -- testB");
  }
}

class testAbstract{
  public static void main(String args[]){
    testC obj = new testC();
    obj.method1();
    obj.method2();
  }
}
