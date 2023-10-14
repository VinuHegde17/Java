abstract class shape{
    public abstract double area();
    void display(){
        System.out.println("Shape is Circle");
    }
}
class circle extends shape{
 private double radius;
 public circle (double radius){  
    this.radius=radius;

 }
 public double area(){
        return Math.PI* radius*radius;
    }   
}
public class p35 {
 public static void main(String args[]){
    circle c=new circle(5);
    c.display();
    System.out.println("Area of a circle is "+c.area());

 }   
}
