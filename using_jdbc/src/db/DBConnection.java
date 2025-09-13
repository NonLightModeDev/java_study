package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  public static Connection getConnection() throws SQLException {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch(ClassNotFoundException e) {
      System.out.printf("\n|* %s *|\n", e.getMessage());
    }

    String url = "jdbc:mysql://localhost:3306/teste";
    String user = "root";
    String password = "admin";

    return DriverManager.getConnection(url, user, password);
  }
}