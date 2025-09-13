package service;

import model.User;
import dao.UserDAO;
import java.sql.SQLException;

public class UserService {
  public static boolean registerUser(User user) {
    UserDAO userDAO = new UserDAO();
    if(user.getName().length() <= 100) {
      try {
        userDAO.insert(user);
      } catch(SQLException e) {
        System.out.printf("\n|* %s *|\n", e.getMessage());
      }
      
      return true;
    }

    return false;
  }

  public static User selectUserById(int id) {
    UserDAO userDAO = new UserDAO();
    User user = null;
    try {
      user = userDAO.select(id);
    } catch(SQLException e) {
      System.out.printf("\n|* %s *|\n", e.getMessage());
    }
    return user;
  }
}