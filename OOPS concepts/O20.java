//Anonymous class.
class Sample {
   public void display() {
      System.out.println("Inside the Sample class");
   }
}

class Anonymous {
   public void function() {
      Sample p1 = new Sample() {
         public void display() {
            System.out.println("Inside an anonymous class.");
         }
      };
      p1.display();
   }
}

class O20 {
   public static void main(String[] args) {
       Anonymous an = new Anonymous();
       an.function();
   }
}