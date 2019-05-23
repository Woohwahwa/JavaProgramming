import java.io.*;
public class ReaderWriterTest {
  public static void main(String[] args) {
    try {
      File inFile = new File("/Users/cindy/Documents/1.Study/School/grade02/semester01/Java/JavaIo__8-13/FileOutputStreamTest.java");
      File outFile = ("/Users/cindy/Documents/1.Study/School/grade02/semester01/Java/JavaIo__8-10/ConsoleTest.java");
      Reader rd = new FileReader(inFile);
      BufferedReader br = new BufferedReader(rd);
      Writer wd = new FileWriter(outFile);
      BufferedWriter bw = new BufferedWriter(wd);
      int nData = br.read();
      while(nData != -1) {
        bw.write(nData);
        nData = br.read();
      }
      br.close();
      bw.close();
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}