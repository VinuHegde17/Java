public class p37 {
   public static void main(String args[]){
   result r=new result(7,5);
   r.display();
   System.out.println("Value is "+r.cal());
} 
}
abstract class add{
 public abstract double cal();
public void display(){
    System.out.println("Addition of 2 no");
}
}
class result extends add{
    private double a;
    private double b;
    public result(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double cal(){
        return a+b;
    }
}