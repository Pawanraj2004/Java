//Interface
interface Polygon {
  void getArea(int l, int b);
}
class Rectangle implements Polygon {
  public void getArea(int l, int b) {
    System.out.println("Area : " + l*b);
  }
}
class O14 {
  public static void main(String[] args) {
    Rectangle rec = new Rectangle();
    rec.getArea(10, 10);
  }
}