// 타입 제한

class Data <T extends Number> {
  private T t;
  public Data(T t) { this.t = t; }
  public void set(T t) { this.t = t; }
  public T get() { return t; }
}

public class BoundedType {
  public static void main(String args[]) {
    Data<Integer> data = new <Integer> Data(20);
    System.out.println(data.get());
  }
}