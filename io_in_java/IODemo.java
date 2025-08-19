import java.io.*;

public class IODemo {
  public static void main(String args[]) {
    try {
      FileWriter fWriter = new FileWriter("./contacts.txt");
      PrintWriter pWriter = new PrintWriter(fWriter);
      pWriter.println("Name: André");
      pWriter.print("Phone: (21) 9XXXX-XXXX");
      pWriter.close();
      fWriter.close();

      FileReader fReader = new FileReader("./contacts.txt");
      int ch;
      while ((ch = fReader.read()) != -1) {
        System.out.print((char) ch);
      }
      fReader.close();
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
  }
}