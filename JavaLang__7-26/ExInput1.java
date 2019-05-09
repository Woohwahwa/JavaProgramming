import java.io.*;

public class ExInput1 {
  public static void main(String[] args) throws IOException {
    char cInput = 0;
    System.out.print("Input a character");
    cInput = (char)System.in.read();
    System.out.println(cInput);
    System.out.println(System.in.available());
  }
}