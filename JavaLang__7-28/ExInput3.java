import java.io.*;

public class ExInput3 {
  public static void main(String[] args) throws IOException {
    int nInput = 0;
    System.out.println("Input an integer");

    nInput = System.in.read();
    nInput -= '0';
    System.out.println(nInput);
  }
}