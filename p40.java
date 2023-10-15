class c1{
   public void display1(){
    System.out.println("Public Modifier");
   } 
}
 class c2{
    protected void display2(){
    System.out.println("Protected Modifier");
    }
}
 class c3{
    private void display3(){
        System.out.println("private Modifier");
    }
}
class c4{
     void display4(){
        System.out.println("Default Modifier");
     }
}
public class p40 {
  public static void main(String args[]){
    c1 c11= new c1();
    c11.display1();
    c2 c22=new c2();
    c22.display2();
    c3 c33=new c3();
   //c33.display3();
    c4 c44=new c4();
    c44.display4();

  } 
}
