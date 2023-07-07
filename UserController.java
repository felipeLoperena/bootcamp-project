package project;
import project.User;

public class UserController{

  //Revisar bien el constructor en un IDE para debuggearlo y saber que funciona bien

  public UserController(List<User> userlist){

    User user = new User(1, "Luis", 26, "Juega Minecraft");
    userlist.add(user);
  }
}
