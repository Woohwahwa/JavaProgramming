// 5-7 다중 타입 매개변수

interface Pair <K, V> {
  public K getKEY();
  public V getValue();
}

class OrderedPair <K, V> implements Pair <K, V> {
  private K key;
  private V value;
  public OrderedPair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() { return key; }
  public V getValue() { return value; }
}