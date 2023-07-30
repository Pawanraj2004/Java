//Encapsulation.
class Area {
  int l;
  int b;
  Area(int l, int b) {
    this.l = l;
    this.b = b;
  }
  public void calArea() {
    int area = l * b;
    System.out.println("Area: " + area);
  }
}
class O16 {
  public static void main(String[] args) {
    Area square = new Area(5, 5);
    square.calArea();
  }
}