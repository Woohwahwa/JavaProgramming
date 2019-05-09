// 예외 전파 예 2

import java.io.*;

class CharInput {
  int nInput = 0;

  public char getInput() throws IOException {
    nInput = System.in.read();
    return (char)nInput;
  }
}

public class ExceptionTest16 {
  public static void main(String[] args) throws IOException {
    CharInput charInput = new CharInput();
    System.out.println(charInput.getInput());
  }
}