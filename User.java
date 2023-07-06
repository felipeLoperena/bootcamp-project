package project;

public class User{

  private long id;
  private String name;
  private int age;
  private String info;

  public User(long id, String name, int age, String info){
    this.id = id;
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
