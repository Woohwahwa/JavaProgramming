import java.io.*;

public class LineNumberTest {
  public static void main(String[] args) {
    try {
      File file = new File("/Users/cindy/Documents/1.Study/School/grade02/semester01/Java/JavaIo__8-13/FileOutputStreamTest.java");
      FileReader fr = new FileReader(file);
      LineNumberReader rd = new LineNumberReader(fr);
      String line;
      while ((line = rd.readLine()) != null) {
        System.out.println(line);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
