public class SubString {
  public static void main(String[] args) {
    String szStr1 = "Look at this stuff, Isn't it neat?"
    + "Wouldn't you think my collection's complete?"
    + "Wouldn't you think I'm the girl, the girl who has everything?";

    for (int i = 0; i < szStr1.length(); i++) {
      char ch = szStr1.charAt(i);
      if (ch == ' ') {
        System.out.println("_");
      } else {
        System.out.println(ch);
      }
    }
  }
}