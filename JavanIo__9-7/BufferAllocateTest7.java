import java.nio.*;

public class BufferAllocateTest7 {
  public static void main(String[] args) throws Exception {
    int c = 1024 * 1024 * 1024;
    ByteBuffer buffer_direct = ByteBuffer.allocateDirect(c);
    buffer_direct.order(ByteOrder.nativeOrder());
    System.out.println(c + "bytes direct buffer is created.");
  }
}