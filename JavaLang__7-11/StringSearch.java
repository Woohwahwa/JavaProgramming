public class StringSearch {
  public static void main(String[] args) {
    String szStr1 = "Hi Cindy! I'm Ruly!";

    int nStrIndex = -1;

    do {
      nStrIndex = szStr1.indexOf("Cindy", nStrIndex + 1);
      if (nStrIndex >= 0) {
        System.out.println(nStrIndex);
      }
    } while (nStrIndex >= 0);

    nStrIndex = szStr1.length();

    do {
      nStrIndex = szStr1.lastIndexOf("Cindy", nStrIndex - 1);
      if (nStrIndex >= 0) {
        System.out.println(nStrIndex);
      }
    } while (nStrIndex >= 0);
  }
}