// 리턴값이 있는 람다식

interface MyInterface {
  public int method(int a, int b);
}

public class LambdaTest20 {
  public static void main(String args[]) {
    // MyInterface f1, f2;
    MyInterface f1 = (a, b) -> a + b;
    System.out.println(f1.method(3, 4));
    // f2 = (a, b) -> a + b;
    // System.out.println(f2.method(5, 6));
  }
};