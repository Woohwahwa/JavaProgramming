import java.io.*;

public class ExInput2 {
  public static void main(String[] args) throws IOException {
    char cInput = 0;
    System.out.print("Input a characters 0");
    while (true) {
      cInput = (char)System.in.read();
      if (cInput == 13 || cInput == 10) {
        continue;
      }
      if (cInput == 'q') {
        break;
      }
      System.out.println(cInput);
      System.out.println("Input a characters 1");
    }
  }
}