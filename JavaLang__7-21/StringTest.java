public class StringTest {
  public static void main(String[] args) {
    final String tmp = "abcde";
    long start, end;
    String str = new String();
    StringBuffer sb = new StringBuffer();
    StringBuffer sb2 = new StringBuffer();

    start = System.nanoTime();

    for (int i = 0; i < 10000; i++) {
      str = str + tmp;
    }

    end = System.nanoTime();
    System.out.println((end-start) / 1000000.0 + "ms");

    start = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      sb.append(tmp);
    }

    end = System.nanoTime(); 
    System.out.println((end-start) / 1000000.0 + "ms");

    start = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      sb2.append(tmp);
    }

    end = System.nanoTime();
    System.out.println((end-start) / 1000000.0 + "ms");
  }
}