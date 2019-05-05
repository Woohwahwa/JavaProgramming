// 람다식을 사용하지 않은 스레드 생성

class MyThread implements Runnable {
  public void run() {
    System.out.println("my thread");
  }
}

public class RunnableTest {
  public static void main(String args[]) {
    Thread thd = new Thread(new MyThread());
    thd.start();
  }
}