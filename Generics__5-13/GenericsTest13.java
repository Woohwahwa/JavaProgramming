// Raw 타입

class Data <T> {
  private T t;
  public Data(T t) { this.t = t; }
  public void set(T t) { this.t = t;}
  public T get() { return t; }
}

public class GenericsTest13 {
  public static void main(String args[]) {
    Data data = new Data("hello");
    System.out.println(data.get());
  }
}