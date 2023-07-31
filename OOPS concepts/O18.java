//Non-static nested class(Inner Class)
class Outer {
    void display(){
            System.out.println("Outer class.");
        }
    class Inner{
        void display(){
            System.out.println("Inner class.");
        }
    }
}
public class O18 {
    public static void main(String[] args) {
        Outer O1 = new Outer();
        O1.display();
        Outer.Inner I1 = O1.new Inner();
         I1.display();
    }
}