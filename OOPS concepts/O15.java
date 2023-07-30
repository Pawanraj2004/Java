//Polymorphism.
class vehicle {
  public void display() {
    System.out.println("It's a vehicle.");
  }
}
class car extends vehicle {
  public void display() {
    System.out.println("It's a car.");
  }
}
class O15 {
  public static void main(String[] args) {
    vehicle v1 = new vehicle();
    v1.display();
    car c1 = new car();
    c1.display();
  }
}
