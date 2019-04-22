// 익명 구현 클래스로 객체 생성하기

interface MyInterface {
  public void method();
}

public class AnonymousTest {
  public static void main(String args[]) {
    MyInterface sub = new MyInterface() {
      public void method() {
        System.out.println("sub1");
      }
    };
    sub.method();
  }
}