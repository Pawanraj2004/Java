//Class and objects.
class science{
    int year = 3;
    void stream(){
        System.out.println("Computer science.");
    }
}
class O1{
    public static void main(String[] args) {
        science student= new science();
        System.out.println("Year : "+ student.year);
        student.stream();
    }
}