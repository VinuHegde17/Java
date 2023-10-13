import java.util.Scanner;

interface add1{
public void cal1();
}
interface add2{
    public void cal2();
}
interface add3 extends add1,add2{
    public void cal3();
}
public class p29 {
  public static void main(String args[]){
    System.out.println("Enter the value");
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
   System.out.println("Value is "+s);
    add3 a= new add3() {
        public void cal1(){
            int a=5,b=10;
            int c= a+b;
         System.out.println("Addition 1 "+c);   
        }
        public void cal2(){
              int a=5,b=10;
            int c= a+b;
         System.out.println("Addition 2 "+c);
        }
        public void cal3(){
              int a=5,b=10;
            int c= a+b;
         System.out.println("Total "+c);
        }
    };
    a.cal1();
    a.cal2();
    a.cal3();
  } 
}
