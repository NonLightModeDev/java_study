import java.io.*;

public class IODemo2 {
  public static void main(String args[]) {
    try {
      int bytesProntos = System.in.available();

      System.out.println(bytesProntos);

      if (bytesProntos > 0) {
        byte[] entrada = new byte[bytesProntos];
        System.in.read(entrada);
      }
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
  }
}