public class RunnableTest24 {
  public static void main(String[] args) {
    Thread thd = new Thread(() -> {
      System.out.println("my thread 24");
    });
    thd.start();
  }
}