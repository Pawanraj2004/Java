//Inheritance.
class stream{
    String str;
    public void course(){
        System.out.println("Course : B.Tech.");
    }
}
class branch extends stream{
    public void display(){
        System.out.println("Specialization : "+str);
    }
}
class O11{
    public static void main(String[] args) {
        branch cs=new branch ();
        cs.str="IoT";
        cs.display();
        cs.course();
    }
}