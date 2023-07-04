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

  public void imprimirSaludo(){
    System.out.println("Hello" + this.name);
  }

  public String toString(){
    System.out.println("{ name = " + this.name
                        + "age = " + this.age
                        + "info = "+ this.info  "}");
  }
}
