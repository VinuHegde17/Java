public class p21{
    
    void display(int a,int b){
        int c=a+b;
        System.out.println("Value of c is "+c);
    }
    void display(double a,double b){
    double c=b-a;
    System.out.println("Value of c is "+c);
    }
  void display(int a,int b,int c){
        int d=a+b+c;
        System.out.println("Value of c is "+d);
    }  
    public static void main(String args[]){
        p21 p=new p21();
        p.display(5,  8);
        p.display(6, 4, 10);
        p.display(7.5, 4.5);
 
    }
}