public class SearchWord {
  public static void main(String[] args) {
    String szStr1 = "Look at this stuff, Isn't it neat?"
    + "Wouldn't you think my collection's complete?"
    + "Wouldn't you think I'm the girl, the girl who has everything?";

    String szFirstWord, szLastWord;
    szFirstWord = szStr1.substring(0, szStr1.indexOf(' '));
    szLastWord = szStr1.substring(szStr1.lastIndexOf(' ') + 1, szStr1.length());
    System.out.println("FirstWord: " + szFirstWord);
    System.out.println("LastWord: " + szLastWord);
  }
}