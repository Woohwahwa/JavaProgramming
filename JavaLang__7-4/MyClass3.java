// toString() method

class MyClass1 {} // 암묵적으로 Object class 사용
class MyClass2 extends Object {
  public String toString() { 
    return "This MyClass2 class";
  };
}

public class MyClass3 {
  public static void main(String[] args) {
    MyClass1 my_class1 = new MyClass1();
    MyClass2 my_class2 = new MyClass2();
    System.out.println(my_class1.toString());
    System.out.println(my_class2.toString());
    System.out.println(my_class1);
    System.out.println(my_class2);
  }
}