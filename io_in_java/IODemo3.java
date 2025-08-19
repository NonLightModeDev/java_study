import java.io.*;

class Person implements Serializable {
  private String name;
  private String birth;

  public Person(String name, String birth) {
    this.name = name;
    this.birth = birth;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

  public String getBirth() {
    return birth;
  }
}

public class IODemo3 {
  public static void main(String args[]) {
    try {
      File file = new File("./list.txt");
      Person p = new Person("André", "04/11/2000");
      System.out.printf("Name: %s | Birth: %s", p.getName(), p.getBirth());

      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
      out.writeObject(p);
      out.close();

      ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
      Person person = (Person) in.readObject();
      in.close();
      System.out.printf("%n%nName: %s | Birth %s", person.getName(), person.getBirth());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    } catch(ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}