//Singleton class.
class Singleton {
   private static Singleton Obj;
   private Singleton() {      
   }
   public static Singleton createobj() {
      if(Obj == null) {
         Obj = new Singleton();
      }
       return Obj;
   }
   public void display() {
       System.out.println("Singleton class.");
   }
}
class O21 {
   public static void main(String[] args) {
      Singleton s1;
      s1= Singleton.createobj();
      s1.display();
   }
}

