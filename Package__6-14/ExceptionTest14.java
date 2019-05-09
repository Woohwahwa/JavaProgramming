// finally Block

import java.io.*;

public class ExceptionTest14 {
  public static void main(String[] args) {
    DataInputStream dis = new DataInputStream(System.in);

    try {
      int i = dis.readInt();
    } catch (Exception e) {
      System.out.println(e.toString());
      System.out.println(e.printStackTrace());
    } finally {
      System.out.println("finally Block");
    }
  }
}