// 예외 전파 예 1

import java.io.*;

class CharInput {
  int nInput = 0;

  public char getInput() throws IOException {
    nInput = System.in.read();
    return (char)nInput;
  }
}

public class ExceptionTest15 {
  public static void main(String[] args) {
    CharInput charInput = new CharInput();
    
    try {
      System.out.println(charInput.getInput());
    } catch (IOException ex) {
      System.out.println(ex);
    }
  }
}