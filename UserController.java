package project;
import project.User;

public class UserController{

  public UserController(List<User> userlist){

    User user = new User(1, "Luis", 26, "Juega Minecraft");
    userlist.add(user);
  }
}
