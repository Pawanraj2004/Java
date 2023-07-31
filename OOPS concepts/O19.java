//static nested class
class Outer {
   static class nested{
       int a=10;
   }

}
public class O19 {
   public static void main(String[] args) {
       Outer.nested nested = new Outer.nested();
       System.out.println("a = " + nested.a);
   }
}
