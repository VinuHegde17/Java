public class p14 {
    public void show(){
        System.out.println("One");
    }
    public class one1{
        void display(){
            System.out.println("One.one");
        }
    }
   public class one2{
        void view(){
            System.out.println("One.two");
        }
    }
  public static void main(String args[]){
        p14 p =new p14();
        p14.one1 obj1= p.new one1();
        p14.one2 obj2=p.new one2();
        p.show();
        obj1.display();
        obj2.view();
    }  
}
