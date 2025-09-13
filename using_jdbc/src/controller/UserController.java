package controller;

import model.User;
import service.UserService;

public class UserController {
  public static void main(String[] args) {
    User user = new User(1, "Irineu", 28);

    UserService.registerUser(user);
    user = UserService.selectUserById(1);

    System.out.printf("ID: %d | Name: %s | Age: %d", user.getId(), user.getName(), user.getAge());
  }
}