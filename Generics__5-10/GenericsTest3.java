// 제네릭 타입을 매개변수로 사용하기

class Data <T> {
  private T t;
  public Data(T t) { this.t = t; }
  public void set(T t) { this.t = t; }
  public T get() { return t; }
}

public class GenericsTest3 {
  public static void main(String args[]) {
    String s1 = new String("hello");
    Data <String> data = new Data <>(s1);
    data.set(s1);
    @SuppressWarnings("unused")
    String s2 = data.get();
  }
}