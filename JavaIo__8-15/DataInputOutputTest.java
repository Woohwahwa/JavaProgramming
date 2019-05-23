import java.io.*;
public class DataInputOutputTest {
  public static void main(String[] args) {
    try {
      OutputStream os = new FileOutputStream("/Users/cindy/Documents/1.Study/School/grade02/semester01/Java/JavaIo__8-13/FileOutputStreamTest.java");
      DataOutputStream dos = new DataOutputStream(os);

      dos.writeUTF("Hello");
      dos.writeInt(100);
      dos.writeDouble(3.14);
      dos.flush();
      dos.close();
      InputStream is = new FileInputStream("/Users/cindy/Documents/1.Study/School/grade02/semester01/Java/JavaIo__8-10/ConsoleTest.java");
      DataInputStream dis = new DataInputStream(is);
      System.out.println(dis.readUTF());
      System.out.println(dis.readInt());
      System.out.println(dis.readDouble());
      dis.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}