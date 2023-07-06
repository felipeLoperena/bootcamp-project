package project;

public class User{

  private String name;
  private int age;
  private String info;

  public User(String name, int age, String info){
    this.name = name;
    this.age = age;
    this.info = info;
  }

  public String toString(){
    System.out.println("{ name = " + this.name
                        + "age = " + this.age
                        + "info = "+ this.info  "}");
  }

  public boolean checkEmail(){
    return true;
  }
}
