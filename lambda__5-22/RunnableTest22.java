// 익명 객체를 이용한 스레드 생성

public class RunnableTest {
  public static void main(String[] args) {
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("my thread");
      }
    };

    Thread thd = new Thread(runnable);
    thd.start();
  }
};