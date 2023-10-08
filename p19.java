import java.util.Scanner;

public class p19 {
 public void marks(){
    System.out.println("Enter marks");
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    switch(m){
        case 1:System.out.println("Pass");
        break;
        case 2:System.out.println("First class");
        break;
        case 3:System.out.println("Second class");
        break;
        case 4:System.out.println("Distinction");
        break;
        default:System.out.println("Fail");
    }
 } 
 public static void main(String args[]){
    p19 p= new p19();
    p.marks();
 }  
}
