import java.nio.*;

public class BufferAllocateTest {
  public static void main(String[] args) throws Exception {
    int c = 1024 * 1024 * 1024;
    Buffer buffer = ByteBuffer.allocate(c);
    System.out.println(c + "bytes buffer is created.");
    Buffer buffer_direct = ByteBuffer.allocateDirect(c);
    System.out.println(c + "bytes direct buffer is created.");
  }
}