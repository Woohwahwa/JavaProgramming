public class ChangeWord {
  public static void main(String[] args) {
    String szStr1 = "Look at this stuff, Isn't it neat?"
    + "Wouldn't you think my collection's complete?"
    + "Wouldn't you think I'm the girl, the girl who has everything?";

    System.out.println(szStr1.trim());
    System.out.println(szStr1.toUpperCase());
    System.out.println(szStr1.toLowerCase());
    System.out.println("Hi Cindy!".replace('i', 'a'));
  }
}