//method.
class O2 {
    public void display(){
        System.out.println("Non-static - cannot be called without creating object");
    }
    public static void display2(){
        System.out.println("Static- can be called without creating object");
    }
    public static void main(String[] args) {
        O2 object=new O2();
        object.display();
        display2();
    }
}
