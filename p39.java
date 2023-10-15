abstract class first{
    public abstract double show();
    public void display(){
        System.out.println("Output");
    } 
}
 class second extends first{
        private double s1;
        private double s2;
        public second(double s1,double s2){
            this.s1=s1;
            this.s2=s2;
        }
        public double show(){
            return s1+s2;
        }
    }

public class p39 {
   public static void main(String args[]){
    second s=new second(10,5);
    s.display();
    System.out.println("Answer is "+s.show());

   } 
}
