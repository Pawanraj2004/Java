//Method overriding.
//Super keyword.
class vehicle{
    public void display(){
        System.out.println("This is a Vehicle");
    }
}
class car extends vehicle{
    public void display(){
        super.display();
        System.out.println("this is a car.");
    }
}
class O12 {
    public static void main(String[] args) {
    car c1 = new car();
    c1.display();
    }
}
