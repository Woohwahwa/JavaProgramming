import java.lang.Object;
import java.util.Calendar;

public class StringCompare {
  public static void main(String args[]) {
    String szStr1 = "test";
    String szStr2 = "test";

    if (szStr1.equals("test")) {
      System.out.println("szStr1 == szStr2");
    } else {
      System.out.println("szStr1 != szStr2");
    }

    String szStr3 = new String("test");

    if (szStr1.compareTo(szStr3) == 0) {
      System.out.println("szStr1 == szStr3");
    } else {
      System.out.println("szStr1 != szStr3");
    }
  }
}