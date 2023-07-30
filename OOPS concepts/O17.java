//Data hiding(Encapsulation + access modifier).
class sample {
  private int a;
  public int get() {
    return a;
  }
  public void set(int a) {
    this.a = a;
  }
}
class O17 {
  public static void main(String[] args) {
    sample s1 = new sample();
    s1.set(10);
    System.out.println("Value of a : " + s1.get());
  }
}