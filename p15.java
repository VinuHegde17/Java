public class p15 {
    int a=10;
        int b=10;
        int c=a+b;
    void add1(){   
        System.out.println("Result is "+c);
    } 
    public class res{
      void mul(){
        int d=c*10;
   System.out.println("Final result is "+d);
      }  
    }
    public static void main(String args[]){
      p15 p= new p15();
      p.add1();
      p15.res r= p.new res();
      r.mul();  
    }
}
