//Reflection.
import java.lang.Class;
import java.lang.reflect.*;

class Super {
}
class Sub extends Super {
  public void display() {
    System.out.println("I am a Sub.");
  }
}
class O25 {
  public static void main(String[] args) {
      Sub s1 = new Sub();
      Class obj = s1.getClass();
      String name = obj.getName();
      System.out.println("Name: " + name);
      Class superClass = obj.getSuperclass();
      System.out.println("Superclass: " + superClass.getName());
    
  }
}