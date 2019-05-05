// 제네릭 인터페이스로 일반 클래스 구현하기

interface Pair <K, V> {
  public K getKey();
  public V getValue();
}

class MyPair implements Pair <String, Integer> {
  private String key;
  private Integer value;

  public MyPair(String key, Integer value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() { return key; }
  public Integer getValue() { return value; }
}

public class ClassFromGeneric {
  public static void main(String args[]) {
    MyPair mp = new MyPair("test", 1);
    System.out.println(mp.getKey());
    System.out.println(mp.getValue());
  }
}