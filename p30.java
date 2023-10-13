interface add1{
public void cal1();
}
interface add2{
    public void cal2();
}
interface add3 extends add1,add2{
    public void cal3();
}
public class p30 {
  public static void main(String args[]){
    add3 a= new add3() {
        public void cal1(){
         System.out.println("Addition 1");   
        }
        public void cal2(){
         System.out.println("Addition 2");
        }
        public void cal3(){
         System.out.println("Total");
        }
    };
    a.cal1();
    a.cal2();
    a.cal3();
  } 
}
