import java.io.*;

public class ListDirectory2 {
  public static void main(String[] args) {
    File file = new File("/Users/cindy/Document/1.Study");
    File files[] = file.listFiles();
    int i = 0;
    while(i < files.length) {
      System.out.println(files[i].getPath());
      System.out.println("\t" + files[i].length());
      i++;
    }
  }
}