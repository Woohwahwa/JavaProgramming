import java.nio.*;

public class BufferAllocateTest {
  public static void main(String[] args) throws Exception {
    byte[] barray = new byte[100];
    Buffer bbuffer = ByteBuffer.wrap(barray);
    
    char[] carray = new char[100];
    Buffer cBuffer = CharBuffer.wrap(carry, 0, 50);
  }
}