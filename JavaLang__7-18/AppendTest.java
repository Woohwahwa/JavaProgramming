public class AppendTest {
  public static void main(String[] args) {
    String szStr1 = "HaHaHa";
    StringBuffer sbBuffer = new StringBuffer(szStr1);
    sbBuffer.append(' ').append("Cidny");
    szStr1 = sbBuffer.toString();
    System.out.println(szStr1);
  }
}