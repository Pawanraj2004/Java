 //Abstract class and methods.
abstract class Animal {
  abstract void food();
}

class Cat extends Animal {
  public void food() {
    System.out.println("Cat food");
  }
}

class Dog extends Animal {
  public void food() {
    System.out.println("Dog food");
  }
}

class O13{
  public static void main(String[] args) {
    Dog m1 = new Dog();
    m1.food();
    Cat s1 = new Cat();
    s1.food();
  }
}