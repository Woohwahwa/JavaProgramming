// 람다식을 사용한 스레드 생성 1

public class RunnableTest23 {
  public static void main(String[] args) {
    Runnable runnable = () -> {
      System.out.println("my thread 23");
    };
    Thread thd = new Thread(runnable);
    thd.start();
  }
}