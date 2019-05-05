// 제네릭 클래스를 상속받는 일반 클래스 정의하기

class Data <T> {
  private T t;
  public Data(T t) { this.t = t; }
  public void set(T t) { this.t = t; }
  public T get() { return t; }
}

class MyData extends Data <Integer> {
  public MyData(Integer i) { super(i); }
}

public class ClassFromGeneric12 {
  public static void main(String args[]) {
    MyData md = new MyData(10);
    System.out.println(md.get());
  }
}