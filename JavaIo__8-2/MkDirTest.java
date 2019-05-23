import java.io.*;

public class MkDirTest {
  public static void main(String args[]) {
    File myFile = new File("/Users/cindy/Documents/test.java");
    if (myFile.mkdirs()) {
      System.out.println("Directory was created.");
    } else {
      System.out.println("Directory was not created.");
    }
  }
}