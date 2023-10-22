public class p56 {
public static void main(String args[]){
num n=new num(5);
System.out.println("Value is "+n.calsquare());
System.out.println("Value is "+n.calcube());

  }  
}
interface shapes{
    double calsquare();
    double calcube();
}
class num implements shapes{
    private double values;
     public num(int no){
        this.values=no;
     }
     public double calsquare(){
        return values*values;
     }
     public double calcube(){
        return values*values*values;
     }
}