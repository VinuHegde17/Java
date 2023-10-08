import java.util.Scanner;

public class p16 {
    public static void marks(){
        System.out.println("Enter the marks");
        Scanner sc=new Scanner(System.in);
        int m =sc.nextInt();
        if(m>35){
            System.out.println("Pass");
        }   
    }
    public static void main(String args[]){
        marks();  
    }
}
