package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class UserDAO {
  private Connection connection;

  public UserDAO() {
    try {
      this.connection = DBConnection.getConnection();
    } catch(SQLException e) {
      System.out.printf("\n|* %s *|\n", e.getMessage());
    }
  }

  public void insert(User user) throws SQLException {
    try {
      Statement stmt = connection.createStatement();
      String sql = "INSERT INTO user(id, name, age) VALUES";
      sql += "(" + user.getId() + ", '" + user.getName() + "', " + user.getAge() + ");";
      stmt.executeUpdate(sql);
    } catch(SQLException e) {
      System.out.printf("\n|* %s *|\n", e.getMessage());
    } finally {
      connection.close();
    }
  }

  public User select(int id) throws SQLException  {
    User user = new User();
    try {
      Statement stmt = connection.createStatement();
      String sql = "SELECT * FROM user WHERE id = " + id;
      ResultSet rs = stmt.executeQuery(sql);
      

      while(rs.next()) {
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
      }
    } catch(SQLException e) {
      System.out.printf("\n|* %s *|\n", e.getMessage());
    } finally {
      connection.close();
    }

    return user;
  }
}