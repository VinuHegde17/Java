import java.util.Scanner;

public class p32 {
    void add(){
        int a=10;
        int b=5;
        int c=a+b;
        System.out.println("Result is "+c);
    }
     void sub(){
        int a=10;
        int b=5;
        int c=a-b;
        System.out.println("Result is "+c);
    }
     void mul(){
        int a=10;
        int b=5;
        int c=a*b;
        System.out.println("Result is "+c);
    }
     void div(){
        int a=10;
        int b=5;
        int c=a/b;
        System.out.println("Result is "+c);
    }
public static void main(String args[]){
    p32 p =new p32();
    System.out.println("Enter your choice");
    Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    switch(n)
    {
        case 1:p.add();
        break;
        case 2:p.sub();
        break;
        case 3:p.mul();
        break;
        case 4:p.div();
        break;
        default: System.out.println("Enter the values from 1 to 4 ");

    }
}
}
